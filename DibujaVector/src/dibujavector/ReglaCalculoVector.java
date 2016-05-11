/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujavector;

import de.erichseifert.vectorgraphics2d.EPSGraphics2D;
import java.awt.Color;
import java.awt.Font;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author lelguea
 */
public class ReglaCalculoVector {
    
    
    static float Largo=45.0f;
    static float Altura=4.9f;
    static float MargenI=3.5f;   // cm
    static float MargenD=3f;   // cm
    static float ppp=96f;

    
    static int T1=30;
    static int T2=20;
    static int T3=10;
    
    
    static ArrayList<Float> ar1 = new ArrayList();
    static ArrayList<Float> ar2 = new ArrayList();
    static ArrayList<Float> ar3 = new ArrayList();
    static ArrayList<Integer> texto = new ArrayList();
    
    public static void LlenaArreglos() {
        ar1.add(1f);
        ar1.add(1.5f);
        ar1.add(2f);
        ar1.add(3f);
        ar1.add(4f);
        ar1.add(5f);
        ar1.add(6f);
        ar1.add(7f);
        ar1.add(8f);
        ar1.add(9f);
        ar1.add(10f);
        
        
        texto.add(1);
        texto.add(2);
        texto.add(3);
        texto.add(4);
        texto.add(5);
        texto.add(6);
        texto.add(7);
        texto.add(8);
        texto.add(9);
        
        
        ar2.add(1.1f);
        ar2.add(1.2f);
        ar2.add(1.3f);
        ar2.add(1.4f);

        ar2.add(1.6f);
        ar2.add(1.7f);
        ar2.add(1.8f);
        ar2.add(1.9f);

        ar2.add(2.5f);
        //ar2.add((float)Math.E);
        //ar2.add((float)Math.PI);
        ar2.add(3.5f);
        ar2.add(4.5f);
        ar2.add(5.5f);
        ar2.add(6.5f);
        ar2.add(7.5f);

        ar3.add(1.05f);
        ar3.add(1.15f);
        ar3.add(1.25f);
        ar3.add(1.35f);
        ar3.add(1.45f);
        ar3.add(1.55f);
        ar3.add(1.65f);
        ar3.add(1.75f);
        ar3.add(1.85f);
        ar3.add(1.95f);
        
        ar3.add(2.1f);
        ar3.add(2.2f);
        ar3.add(2.3f);
        ar3.add(2.4f);
        
        ar3.add(2.6f);
        ar3.add(2.7f);
        ar3.add(2.8f);
        ar3.add(2.9f);
        
        ar3.add(3.1f);
        ar3.add(3.2f);
        ar3.add(3.3f);
        ar3.add(3.4f);
        
        ar3.add(3.6f);
        ar3.add(3.7f);
        ar3.add(3.8f);
        ar3.add(3.9f);
        
        ar3.add(4.1f);
        ar3.add(4.2f);
        ar3.add(4.3f);
        ar3.add(4.4f);
        
        ar3.add(4.6f);
        ar3.add(4.7f);
        ar3.add(4.8f);
        ar3.add(4.9f);
        
        ar3.add(5.1f);
        ar3.add(5.2f);
        ar3.add(5.3f);
        ar3.add(5.4f);
        
        ar3.add(5.6f);
        ar3.add(5.7f);
        ar3.add(5.8f);
        ar3.add(5.9f);        
        
        
        ar3.add(6.2f);
        ar3.add(6.4f);
        ar3.add(6.6f);
        ar3.add(6.8f);
        
        ar3.add(7.2f);
        ar3.add(7.4f);
        ar3.add(7.6f);
        ar3.add(7.8f);
        
        ar3.add(8.2f);
        ar3.add(8.4f);
        ar3.add(8.6f);
        ar3.add(8.8f);

        ar3.add(9.2f);
        ar3.add(9.4f);
        ar3.add(9.6f);
        ar3.add(9.8f);
        
    }

    public static void main(String[] adsad) {
        
        int Ancho = (int) (Largo/2.54*ppp);
        int Alto=(int) (Altura/2.54*ppp);
        System.out.println(Ancho+"x"+Alto);
        LlenaArreglos();
        //BufferedImage imgS_I = new BufferedImage(Ancho, 5*Alto, BufferedImage.TYPE_INT_RGB);
        EPSGraphics2D imgS_I = new EPSGraphics2D(0.0, 0.0,Ancho , 2*Alto);
        //BufferedImage imgC = new BufferedImage(Ancho, Alto, BufferedImage.TYPE_INT_RGB);
        EPSGraphics2D imgC = new EPSGraphics2D(0.0, 0.0,Ancho , Alto);
        int Delta=0;
        //Graphics big = imgS_I.getGraphics();
        imgS_I.setBackground(Color.WHITE);
        imgS_I.setColor(Color.WHITE);
        imgS_I.fillRect(0,0, Ancho, 2*Alto);
        DibujaSup(imgS_I, Delta);
        DibujaCentral(imgC);
        Delta=Alto;
        DibujaInf(imgS_I,Delta);

        try (FileOutputStream fileAC = new FileOutputStream("ac.eps")) {
            fileAC.write(imgS_I.getBytes());
        } catch (Exception exce) {
            System.err.println(exce.toString());
        } 

        
        try (FileOutputStream fileB = new FileOutputStream("b.eps")) {
            fileB.write(imgC.getBytes());
        } catch (Exception exce) {
            System.err.println(exce.toString());
        } 
        
    }

    
    
    private static void DibujaSup(EPSGraphics2D img, int delta) {
        
        int Ancho = (int) (Largo/2.54*ppp);
        int Alto=(int) (Altura/2.54*ppp);
        System.out.println(Ancho+"x"+Alto);
        
        float Espacio=((Largo-MargenD-MargenI)/2.54f*ppp);
        System.out.println(Espacio);
        
        //BufferedImage img = new BufferedImage(Ancho, 3*Alto, BufferedImage.TYPE_INT_RGB);
        
        int r = 0;
        int g = 0;
        int b = 0;
        int col1 = (r << 16) | (g << 8) | b;
        
        r = 255;
        g = 0;
        b = 0;
        int col2 = (r << 16) | (g << 8) | b;
        
        r = 0;
        g = 0;
        b = 255;
        int col3 = (r << 16) | (g << 8) | b;


        
        img.setColor(Color.BLACK);
        img.fillRect(0,0+delta, Ancho, Alto);
        img.setColor(Color.WHITE);
        img.fillRect(1,1+delta, Ancho-2, Alto-2);
        
        
        img.setColor(Color.BLACK);
        img.setFont(new Font("Arial", Font.PLAIN, 18));
        
        double Separacion=Espacio*Math.log(2)/Math.log(100);
        System.out.println(Separacion);

        img.setColor(new Color(col1));
        // Lineas Principales
        for (int i=0;i<ar1.size();i++) {
            double Pos=Separacion*Math.log(ar1.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawLine(indice, Alto-1+delta, indice, Alto-T1+delta);
            
            Pos=Separacion*Math.log(ar1.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawLine(indice, Alto-1+delta, indice, Alto-T1+delta);
            
        }
        
        // Lineas Secundarias
        img.setColor(new Color(col2));
        for (int i=0;i<ar2.size();i++) {
            double Pos=Separacion*Math.log(ar2.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawLine(indice, Alto-1+delta, indice, Alto-T2+delta);
            
            Pos=Separacion*Math.log(ar2.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawLine(indice, Alto-1+delta, indice, Alto-T2+delta);
        }

        // Lineas terciarias
        img.setColor(new Color(col3));
        for (int i=0;i<ar3.size();i++) {
            double Pos=Separacion*Math.log(ar3.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawLine(indice, Alto-1+delta, indice, Alto-T3+delta);
            
            Pos=Separacion*Math.log(ar3.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawLine(indice, Alto-1+delta, indice, Alto-T3+delta);

        }
        
        
        //Texto
        img.setColor(new Color(col1));
        for (int i=0;i<texto.size();i++) {
            double Pos=Separacion*Math.log(texto.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawString(texto.get(i).toString(), indice-5, Alto-31+delta);
            
            Pos=Separacion*Math.log(texto.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawString(texto.get(i).toString(), indice-5, Alto-31+delta);
        }

        img.setColor(new Color(col2));
        double Pos=Separacion*Math.log(Math.PI)/Math.log(2);
        int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        img.drawLine(indice, Alto-1+delta, indice, Alto-T2+delta);

        //img.drawString("\u03c0", indice-5, Alto-25+delta);
        /*
        Pos=Separacion*Math.log(Math.PI*10)/Math.log(2);
        indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        big.drawString("\u03c0", indice-5, 45);
        big.drawString("\u03c0", indice-5, Alto-45);
        */

        img.setColor(new Color(col2));
        Pos=Separacion*Math.log(Math.E)/Math.log(2);
        indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        img.drawLine(indice, Alto-1+delta, indice, Alto-T2+delta);

        img.setColor(new Color(col1));
        img.drawString("e", indice-5+delta, Alto-25);
        
        
        img.setFont(new Font("Arial", Font.PLAIN, 24));
        img.drawString("A", (int) (MargenI/2.54*ppp-30), Alto-15+delta);
        
        //DibujaInf(img);
   
        /*
        File f = new File("a_c.png");
        try {
            ImageIO.write(img, "PNG", f);
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
        */ 
      
    }
    
    
    private static void DibujaCentral(EPSGraphics2D img) {
                
        int Ancho = (int) (Largo/2.54*ppp);
        int Alto=(int) (Altura/2.54*ppp);
        //System.out.println(Ancho+"x"+Alto);
        
        float Espacio=((Largo-MargenD-MargenI)/2.54f*ppp);
        //System.out.println(Espacio);
        
        
        //BufferedImage img = new BufferedImage(Ancho, Alto, BufferedImage.TYPE_INT_RGB);
        
        int r = 0;
        int g = 0;
        int b = 0;
        int color1 = (r << 16) | (g << 8) | b;
        
        r = 255;
        g = 0;
        b = 0;
        int color2 = (r << 16) | (g << 8) | b;
        
        r = 0;
        g = 0;
        b = 255;
        int color3 = (r << 16) | (g << 8) | b;


        
        //Graphics big = img.get
        //big.setColor(Color.WHITE);
        img.setBackground(Color.WHITE);
        img.setColor(Color.WHITE);
        img.fillRect(1, 1, Ancho-2, Alto-2);
        
        
        img.setColor(Color.BLACK);
        img.setFont(new Font("Arial", Font.PLAIN, 18));
        
        double Separacion=Espacio*Math.log(2)/Math.log(100);
        //System.out.println(Separacion);

        // Lineas Principales
        for (int i=0;i<ar1.size();i++) {
            double Pos=Separacion*Math.log(ar1.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceCi= (int) (1-2*Math.round(Pos)+Espacio+MargenI/2.54*ppp);
            //System.out.println(indice+", "+indiceCi);
            img.setColor(new Color(color1));
            img.drawLine(indice, 1, indice, T1);
            img.drawLine(indice2, Alto-1, indice2, Alto-T1);
            img.drawLine(indiceCi, Alto/2-1+T2, indiceCi, Alto/2-T1+T2);
            
            Pos=Separacion*Math.log(ar1.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawLine(indice, 1, indice, T1);
        }
        
        // Lineas Secundarias
        for (int i=0;i<ar2.size();i++) {
            double Pos=Separacion*Math.log(ar2.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceCi= (int) (1-2*Math.round(Pos)+Espacio+MargenI/2.54*ppp);
            
            img.setColor(new Color(color2));
            img.drawLine(indice, 1, indice, T2);
            img.drawLine(indice2, Alto-1, indice2, Alto-T2);
            img.drawLine(indiceCi, Alto/2-1+T2, indiceCi,Alto/2);
            
            Pos=Separacion*Math.log(ar2.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawLine(indice, 1, indice, T2);

        }

        // Lineas terciarias
        for (int i=0;i<ar3.size();i++) {
            double Pos=Separacion*Math.log(ar3.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceCi= (int) (1-2*Math.round(Pos)+Espacio+MargenI/2.54*ppp);
            
            img.setColor(new Color(color3));
            img.drawLine(indice, 1, indice, T3);
            img.drawLine(indice2, Alto-1, indice2, Alto-T3);
            img.drawLine(indiceCi, Alto/2-1+T2, indiceCi, Alto/2-T3+T2);

            
            Pos=Separacion*Math.log(ar3.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            
            img.drawLine(indice, 1, indice, T3);
        }
        
        
        //Texto
        img.setColor(new Color(color1));
        for (int i=0;i<texto.size();i++) {
            double Pos=Separacion*Math.log(texto.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceCi= (int) (1-2*Math.round(Pos)+Espacio+MargenI/2.54*ppp);
            
            img.drawString(texto.get(i).toString(), indice-5, 45);
            img.drawString(texto.get(i).toString(), indice2-5, Alto-32);
            img.drawString(texto.get(i).toString(), indiceCi-5, Alto/2-12);
            
            Pos=Separacion*Math.log(texto.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            img.drawString(texto.get(i).toString(), indice-5, 45);
        }

        double Pos=Separacion*Math.log(Math.PI)/Math.log(2);
        int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
        img.setColor(new Color(color2));
        img.drawLine(indice, 1, indice, T2);
        img.drawLine(indice2, Alto-1, indice2, Alto-T2);
        

        //img.drawString("\u03c0", indice-5, 35);
        //img.drawString("\u03c0", indice2-5, Alto-25);
        /*
        Pos=Separacion*Math.log(Math.PI*10)/Math.log(2);
        indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        big.drawString("\u03c0", indice-5, 45);
        big.drawString("\u03c0", indice-5, Alto-45);
        */
        
        
        Pos=Separacion*Math.log(Math.E)/Math.log(2);
        indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
        img.setColor(new Color(color2));
        img.drawLine(indice, 1, indice, T2);
        img.drawLine(indice2,Alto-1,indice2,Alto-T2);


        img.setColor(new Color(color1));
        img.drawString("e", indice-5, 35);
        img.drawString("e", indice2-5, Alto-22);
        
        
        img.setFont(new Font("Arial", Font.PLAIN, 24));
        img.drawString("B", (int) (MargenI/2.54*ppp-30), 25);
        img.drawString("C", (int) (MargenI/2.54*ppp-30), Alto-15);
        img.drawString("Ci", (int) (MargenI/2.54*ppp-30), Alto/2+5);
      
    }
    
    
    private static void DibujaInf(EPSGraphics2D img, int delta) {
        
        int Ancho = (int) (Largo/2.54*ppp);
        int Alto=(int) (Altura/2.54*ppp);
        //System.out.println(Ancho+"x"+Alto);
        
        float Espacio=((Largo-MargenD-MargenI)/2.54f*ppp);
        //System.out.println(Espacio);
        
        //BufferedImage img = new BufferedImage(Ancho, Alto, BufferedImage.TYPE_INT_RGB);
        
        int r = 0;
        int g = 0;
        int b = 0;
        int color1 = (r << 16) | (g << 8) | b;
        
        r = 255;
        g = 0;
        b = 0;
        int col2 = (r << 16) | (g << 8) | b;
        
        r = 0;
        g = 0;
        b = 255;
        int col3 = (r << 16) | (g << 8) | b;


        
        img.setColor(Color.BLACK);
        img.fillRect(0,0+delta, Ancho, Alto);
        img.setColor(Color.WHITE);
        img.fillRect(1,1+delta, Ancho-2, Alto-2);

        
        
        img.setColor(Color.BLACK);
        img.setFont(new Font("Arial", Font.PLAIN, 18));
        
        double Separacion=Espacio*Math.log(2)/Math.log(100);
        double SeparacionK=Espacio*Math.log(2)/Math.log(1000);
        //System.out.println(Separacion);

        // Lineas Principales
        img.setColor(new Color(color1));
        for (int i=0;i<ar1.size();i++) {
            double Pos=Separacion*Math.log(ar1.get(i))/Math.log(2);
            double PosK=SeparacionK*Math.log(ar1.get(i))/Math.log(2);
            int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawLine(indice, 1+delta, indice, T1+delta);
            img.drawLine(indiceK, Alto-1+delta, indiceK, Alto-T1+delta);
            
            
            PosK=SeparacionK*Math.log(ar1.get(i)*10)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawLine(indiceK, Alto-1+delta, indiceK, Alto-T1+delta);
            
            
            PosK=SeparacionK*Math.log(ar1.get(i)*100)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawLine(indiceK, Alto-1+delta, indiceK, Alto-T1+delta);

            
        }
        
        // Lineas Secundarias
        img.setColor(new Color(col2));
        for (int i=0;i<ar2.size();i++) {
            double Pos=Separacion*Math.log(ar2.get(i))/Math.log(2);
            double PosK=SeparacionK*Math.log(ar2.get(i))/Math.log(2);
            int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawLine(indice, 1+delta, indice, T2+delta);
            img.drawLine(indiceK, Alto-1+delta, indiceK, Alto-T2+delta);

            
            PosK=SeparacionK*Math.log(ar2.get(i)*10)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawLine(indiceK, Alto-1+delta, indiceK, Alto-T2+delta);

            
            PosK=SeparacionK*Math.log(ar2.get(i)*100)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawLine(indiceK, Alto-1+delta, indiceK, Alto-T2+delta);

            
        }

        // Lineas terciarias
        img.setColor(new Color(col3));
        for (int i=0;i<ar3.size();i++) {
            double Pos=Separacion*Math.log(ar3.get(i))/Math.log(2);
            double PosK=SeparacionK*Math.log(ar3.get(i))/Math.log(2);
            int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawLine(indice, 1+delta, indice, T3+delta);
            img.drawLine(indiceK, Alto-1+delta, indiceK, Alto-T3+delta);
            
            
            PosK=SeparacionK*Math.log(ar3.get(i)*10)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawLine(indiceK, Alto-1+delta, indiceK, Alto-T3+delta);

            
            PosK=SeparacionK*Math.log(ar3.get(i)*100)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawLine(indiceK, Alto-1+delta, indiceK, Alto-T3+delta);

        }
        
        
        //Texto
        img.setColor(new Color(color1));
        for (int i=0;i<texto.size();i++) {
            double Pos=Separacion*Math.log(texto.get(i))/Math.log(2);
            double PosK=SeparacionK*Math.log(texto.get(i))/Math.log(2);
            int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            img.drawString(texto.get(i).toString(), indice-5, 45+delta);
            img.drawString(texto.get(i).toString(), indiceK-5, Alto-32+delta);
            
            PosK=SeparacionK*Math.log(texto.get(i)*10)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);   
            img.drawString(texto.get(i).toString(), indiceK-5, Alto-32+delta);
            
            PosK=SeparacionK*Math.log(texto.get(i)*100)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);   
            img.drawString(texto.get(i).toString(), indiceK-5, Alto-32+delta);
            
        }
        
        // Dibujo las L
        img.setColor(new Color(col3));
        for (int i=0;i<=100;i++) {
            double Pos=i*Espacio/100;
            int indice= (int) (Pos+MargenI/2.54*ppp);
            img.drawLine(indice, 1+Alto/2+5+delta, indice, T3+Alto/2+5+delta);
        }

        img.setColor(new Color(col2));
        for (int i=0;i<=100;i=i+5) {
            double Pos=i*Espacio/100;
            int indice= (int) (Pos+MargenI/2.54*ppp);
            img.drawLine(indice, 1+Alto/2+5+delta, indice, T2+Alto/2+5+delta);
        }

        img.setColor(new Color(color1));
        for (int i=0;i<=100;i=i+10) {
            double Pos=i*Espacio/100;
            int indice= (int) (Pos+MargenI/2.54*ppp);
            img.drawLine(indice, 1+Alto/2+2+delta, indice, T1+Alto/2+2+delta);
            
            img.drawString(""+(i/10), indice-5, Alto/2-12+delta);
        }
        
        

        img.setColor(new Color(col2));
        double Pos=Separacion*Math.log(Math.PI)/Math.log(2);
        int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
        img.drawLine(indice, 1+delta, indice, T2+delta);

        //img.drawString("\u03c0", indice-5, 35+delta);
        
        Pos=Separacion*Math.log(Math.E)/Math.log(2);
        indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
        img.drawLine(indice, 1+delta, indice, T2+delta);

        img.setColor(new Color(color1));
        img.drawString("e", indice-5, 35+delta);
        
        
        img.setFont(new Font("Arial", Font.PLAIN, 24));
        img.drawString("D", (int) (MargenI/2.54*ppp-30), 25+delta);
        img.drawString("K", (int) (MargenI/2.54*ppp-30), Alto-15+delta);
        img.drawString("L", (int) (MargenI/2.54*ppp-30), Alto/2+5+delta);

           
    }
    
}
