/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapatematico;

import java.util.ArrayList;

/**
 *
 * @author lelguea
 */
public class MapaTematico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicia();
        tema("p001","Lorenzo Elguea","#t_persona");
        tema("p002","Rosy Neumann","#t_persona");
        tema("p003","Miguel Elguea Neumann","#t_persona");
        /*
        for (int i=1000;i<1100;i++) {
            tema("p"+i,"Me llamo "+i,"#t_persona");
        }
        */
        tema("a001","Aztek", "#t_auto");
        tema("a002","Audi", "#t_auto");
        tema("a003","Mercedes", "#t_auto");
        
        tema("m001","Cookie", "#t_gato");
        tema("m002","Titan", "#t_perro");
        tema("m003","Lulu", "#t_mascota");
        tema("m004","Pancho", "#t_pez");
        
        ArrayList<Integrante> elem1 = new ArrayList<>();
        elem1.add(new Integrante("#p001", "#t_persona"));
        elem1.add(new Integrante("#a001","#t_auto"));
        Asociacion("#t_posesion", elem1);

        ArrayList<Integrante> elem2 = new ArrayList<>();
        elem2.add(new Integrante("#p001", "#t_persona"));
        elem2.add(new Integrante("#p002", "#t_persona"));
        elem2.add(new Integrante("#a002","#t_auto"));
        Asociacion("#t_posesion", elem2);

        ArrayList<Integrante> elem3 = new ArrayList<>();
        elem3.add(new Integrante("#p001", "#t_persona"));
        elem3.add(new Integrante("#p002", "#t_persona"));
        elem3.add(new Integrante("#p003", "#t_persona"));
        elem3.add(new Integrante("#a003","#t_auto"));
        Asociacion("#t_posesion", elem3);
        
        
        
        fin();
    }
    
    public static void inicia () {
        System.out.println("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>\n" +
                            "<topicMap xmlns=\"http://www.topicmaps.org/xtm/1.0/\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" id=\"lor.hytm\">");
        tema("t_persona","Persona","");
        tema("t_auto","Automovil","");
        tema("t_relacion","Relacion","");
        tema("t_posesion","Posesion","");
        tema("t_mascota","Mascota","");
        tema("t_gato","Gato","#t_mascota");
        tema("t_perro","Perro","#t_mascota");
        tema("t_pez","Pez","#t_mascota");
    }
    public static void fin () {
        System.out.println("</topicMap>");
    }
    
    public static void tema(String id, String nombre, String Instancia) {
        System.out.println("<topic id=\""+id+"\">");
        if (!Instancia.isEmpty()) {
            System.out.println("      <instanceOf>\n" +
            "         <topicRef xlink:href=\"" + Instancia + "\">\n" +
            "         </topicRef>\n" +
            "      </instanceOf>");
        }
        System.out.println("      <baseName>\n" +
        "         <baseNameString>"+nombre+"</baseNameString>\n" +
        "      </baseName>\n" +
        "   </topic>");
        
    }
    
    public static void Asociacion(String Instancia, ArrayList<Integrante> inte) {
        System.out.println("   <association>\n" +
"      <instanceOf>\n" +
"         <topicRef xlink:href=\""+Instancia+"\">\n" +
"         </topicRef>\n" +
"      </instanceOf>");
        for (int i=0;i<inte.size();i++) {
            Integrante m = inte.get(i);
            System.out.println("      <member>\n" +
                    "         <roleSpec>\n" +
                    "            <topicRef xlink:href=\""+m.Instancia+"\">\n" +
                    "            </topicRef>\n" +
                    "         </roleSpec>\n" +
                    "         <topicRef xlink:href=\""+m.ID+"\">\n" +
                    "         </topicRef>\n" +
                    "      </member>");
        }
        System.out.println("   </association>");
        
    }
    
}
