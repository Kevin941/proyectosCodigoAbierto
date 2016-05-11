/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snmp_scan;

import snmpup.SNMP4JHelper;

/**
 *
 * @author lelguea
 */
public class SNMP_Scan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=1;i<255;i++) {
            String ipAddress="192.100.230."+i;
            System.out.println(ipAddress);
            String Comunidad="private";
            String OIDInicial="1.3.6.1.2.1.1";
            //OIDInicial="1.3.6.1.2.1.2.2.1";
            String OID=SNMP4JHelper.snmpGetNextOID(ipAddress,Comunidad,OIDInicial);
            while (OID.contains(OIDInicial)) {
                //String ip=OID.substring(OIDInicial.length()+1,OID.length()-4);
                String ip="";
                System.out.println("inicio("+ip+") = "+SNMP4JHelper.snmpGet(ipAddress,Comunidad, OID));
                //System.out.println("inicio2 = "+SNMP4JHelper.snmpGetNext(ipAddress,Comunidad,OID));
                //System.out.println("inicio3 = "+SNMP4JHelper.snmpGetNextOID(ipAddress,Comunidad,OID));
                OID=SNMP4JHelper.snmpGetNextOID(ipAddress,Comunidad,OID);
            }

            System.out.println("\n\n");
        }

        // TODO code application logic here
    }
    
}
