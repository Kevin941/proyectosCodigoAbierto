/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package snmp_scan;

import snmpup.SNMP4JHelper;

/**
 *
 * @author lelguea
 */


public class SNMPbgp {



    public static void ConsultaBGP(String ipAddress, String Comunidad) throws Exception {
        //String Comunidad="varios";
        String OIDInicial="1.3.6.1.4.1.9.9.187.1.2.4.1.1";
        //OIDInicial="1.3.6.1.2.1.2.2.1";
        String OID=SNMP4JHelper.snmpGetNextOID(ipAddress,Comunidad,OIDInicial);
        while (OID.contains(OIDInicial)) {
            String ip=OID.substring(OIDInicial.length()+1,OID.length()-4);
            System.out.println("inicio("+ip+") = "+SNMP4JHelper.snmpGet(ipAddress,Comunidad, OID));
            //System.out.println("inicio2 = "+SNMP4JHelper.snmpGetNext(ipAddress,Comunidad,OID));
            //System.out.println("inicio3 = "+SNMP4JHelper.snmpGetNextOID(ipAddress,Comunidad,OID));
            OID=SNMP4JHelper.snmpGetNextOID(ipAddress,Comunidad,OID);
        }
        
        System.out.println("\n\n");

        OIDInicial="1.3.6.1.4.1.9.9.187.1";
        //OIDInicial="1.3.6.1.2.1.2.2.1";
        OID=SNMP4JHelper.snmpGetNextOID(ipAddress,Comunidad,OIDInicial);
        while (OID.contains(OIDInicial)) {
            //String ip=OID.substring(OIDInicial.length()+1,OID.length()-4);
            System.out.println("inicio("+OID+") = "+SNMP4JHelper.snmpGet(ipAddress,Comunidad, OID));
            //System.out.println("inicio2 = "+SNMP4JHelper.snmpGetNext(ipAddress,Comunidad,OID));
            //System.out.println("inicio3 = "+SNMP4JHelper.snmpGetNextOID(ipAddress,Comunidad,OID));
            OID=SNMP4JHelper.snmpGetNextOID(ipAddress,Comunidad,OID);
        }
        
        
        
    }


 }