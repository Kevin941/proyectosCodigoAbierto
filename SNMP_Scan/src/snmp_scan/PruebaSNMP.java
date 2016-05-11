/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package snmp_scan;


/**
 *
 * @author lelguea
 */
public class PruebaSNMP {

    public static void main(String[] asdasd) throws Exception {
        String ip="ipv6_mix";
        String comunidad="varios";
        //SNMPInicial.Consulta(ip);
        //SNMPInterfaces.ConsultaIf(ip, comunidad);
        //TablaInterfaces.ConsultaIf(ip, comunidad);
        //SNMPAlmacenamiento.ConsultaAlmacenamiento(ip);
        //TablaVlans.ConsultaVlan(ip, com);
        //TablaVTP.ConsultaVTP(ip, com);
        SNMPbgp.ConsultaBGP(ip, comunidad);
    }

}
