/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujapng;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author lelguea
 */
public class Final {
    
    
    static float Largo=45.0f;
    static float Altura=4.9f;
    static float MargenI=3.5f;   // cm
    static float MargenD=3f;   // cm
    static float ppp=96f;

    public static void main(String[] adsad) {
       
        DibujaSup();
        DibujaCentral();
        DibujaInf();
        
    }

    
    
    private static void DibujaSup() {
        
        int T1=30;
        ArrayList<Float> ar1 = new ArrayList();
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
        
        ArrayList<Integer> texto = new ArrayList();
        texto.add(1);
        texto.add(2);
        texto.add(3);
        texto.add(4);
        texto.add(5);
        texto.add(6);
        texto.add(7);
        texto.add(8);
        texto.add(9);
        
        
        int T2=20;
        ArrayList<Float> ar2 = new ArrayList();
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

        int T3=10;
        ArrayList<Float> ar3 = new ArrayList();
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
        
        int Ancho = (int) (Largo/2.54*ppp);
        int Alto=(int) (Altura/2.54*ppp);
        System.out.println(Ancho+"x"+Alto);
        
        float Espacio=((Largo-MargenD-MargenI)/2.54f*ppp);
        System.out.println(Espacio);
        
        
        BufferedImage img = new BufferedImage(Ancho, Alto, BufferedImage.TYPE_INT_RGB);
        
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


        
        Graphics big = img.getGraphics();
        big.setColor(Color.WHITE);
        big.fillRect(1,1, Ancho-2, Alto-2);
        
        
        big.setColor(Color.BLACK);
        big.setFont(new Font("Arial", Font.PLAIN, 18));
        
        double Separacion=Espacio*Math.log(2)/Math.log(100);
        System.out.println(Separacion);

        // Lineas Principales
        for (int i=0;i<ar1.size();i++) {
            double Pos=Separacion*Math.log(ar1.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            for (int j=1;j<T1;j++) {
                img.setRGB(indice, Alto-j, col1);
            }
            
            Pos=Separacion*Math.log(ar1.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            for (int j=1;j<T1;j++) {
                img.setRGB(indice, Alto-j, col1);
            }
        }
        
        // Lineas Secundarias
        for (int i=0;i<ar2.size();i++) {
            double Pos=Separacion*Math.log(ar2.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            for (int j=1;j<T2;j++) {
                img.setRGB(indice, Alto-j, col2);
            }
            
            Pos=Separacion*Math.log(ar2.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            for (int j=1;j<T2;j++) {
                img.setRGB(indice, Alto-j, col2);
            }
        }

        // Lineas terciarias
        for (int i=0;i<ar3.size();i++) {
            double Pos=Separacion*Math.log(ar3.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            for (int j=1;j<T3;j++) {
                img.setRGB(indice, Alto-j, col3);
            }
            
            Pos=Separacion*Math.log(ar3.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            for (int j=1;j<T3;j++) {
                img.setRGB(indice, Alto-j, col3);
            }
        }
        
        
        //Texto
        for (int i=0;i<texto.size();i++) {
            double Pos=Separacion*Math.log(texto.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            big.drawString(texto.get(i).toString(), indice-5, Alto-31);
            
            Pos=Separacion*Math.log(texto.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            big.drawString(texto.get(i).toString(), indice-5, Alto-31);
        }

        double Pos=Separacion*Math.log(Math.PI)/Math.log(2);
        int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        for (int j=1;j<T2;j++) {
            img.setRGB(indice, Alto-j, col2);
        }

        big.drawString("\u03c0", indice-5, Alto-25);
        /*
        Pos=Separacion*Math.log(Math.PI*10)/Math.log(2);
        indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        big.drawString("\u03c0", indice-5, 45);
        big.drawString("\u03c0", indice-5, Alto-45);
        */
        
        Pos=Separacion*Math.log(Math.E)/Math.log(2);
        indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        for (int j=1;j<T2;j++) {
            img.setRGB(indice, Alto-j, col2);
        }

        big.drawString("e", indice-5, Alto-25);
        
        
        big.setFont(new Font("Arial", Font.PLAIN, 24));
        big.drawString("A", (int) (MargenI/2.54*ppp-30), Alto-15);
        
        File f = new File("a.png");
        try {
            ImageIO.write(img, "PNG", f);
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
      
    }
    
    
    private static void DibujaCentral() {
        
        int T1=30;
        ArrayList<Float> ar1 = new ArrayList();
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
        
        ArrayList<Integer> texto = new ArrayList();
        texto.add(1);
        texto.add(2);
        texto.add(3);
        texto.add(4);
        texto.add(5);
        texto.add(6);
        texto.add(7);
        texto.add(8);
        texto.add(9);
        
        
        int T2=20;
        ArrayList<Float> ar2 = new ArrayList();
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

        int T3=10;
        ArrayList<Float> ar3 = new ArrayList();
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
        
        int Ancho = (int) (Largo/2.54*ppp);
        int Alto=(int) (Altura/2.54*ppp);
        //System.out.println(Ancho+"x"+Alto);
        
        float Espacio=((Largo-MargenD-MargenI)/2.54f*ppp);
        //System.out.println(Espacio);
        
        
        BufferedImage img = new BufferedImage(Ancho, Alto, BufferedImage.TYPE_INT_RGB);
        
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


        
        Graphics big = img.getGraphics();
        big.setColor(Color.WHITE);
        big.fillRect(1, 1, Ancho-2, Alto-2);
        
        
        big.setColor(Color.BLACK);
        big.setFont(new Font("Arial", Font.PLAIN, 18));
        
        double Separacion=Espacio*Math.log(2)/Math.log(100);
        //System.out.println(Separacion);

        // Lineas Principales
        for (int i=0;i<ar1.size();i++) {
            double Pos=Separacion*Math.log(ar1.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceCi= (int) (1-2*Math.round(Pos)+Espacio+MargenI/2.54*ppp);
            //System.out.println(indice+", "+indiceCi);
            for (int j=1;j<T1;j++) {
                img.setRGB(indice, j, color1);
                img.setRGB(indice2, Alto-j, color1);
                img.setRGB(indiceCi, Alto/2-j+T2, color1);
            }
            
            Pos=Separacion*Math.log(ar1.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            for (int j=1;j<T1;j++) {
                img.setRGB(indice, j, color1);
            }
        }
        
        // Lineas Secundarias
        for (int i=0;i<ar2.size();i++) {
            double Pos=Separacion*Math.log(ar2.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceCi= (int) (1-2*Math.round(Pos)+Espacio+MargenI/2.54*ppp);
            for (int j=1;j<T2;j++) {
                img.setRGB(indice, j, color2);
                img.setRGB(indice2, Alto-j, color2);
                img.setRGB(indiceCi, Alto/2-j+T2, color2);
            }
            
            Pos=Separacion*Math.log(ar2.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            for (int j=1;j<T2;j++) {
                img.setRGB(indice, j, color2);
            }
        }

        // Lineas terciarias
        for (int i=0;i<ar3.size();i++) {
            double Pos=Separacion*Math.log(ar3.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceCi= (int) (1-2*Math.round(Pos)+Espacio+MargenI/2.54*ppp);
            for (int j=1;j<T3;j++) {
                img.setRGB(indice, j, color3);
                img.setRGB(indice2, Alto-j, color3);
                img.setRGB(indiceCi, Alto/2-j+T2, color3);
            }
            
            Pos=Separacion*Math.log(ar3.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            for (int j=1;j<T3;j++) {
                img.setRGB(indice, j, color3);
            }
        }
        
        
        //Texto
        for (int i=0;i<texto.size();i++) {
            double Pos=Separacion*Math.log(texto.get(i))/Math.log(2);
            int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceCi= (int) (1-2*Math.round(Pos)+Espacio+MargenI/2.54*ppp);
            
            big.drawString(texto.get(i).toString(), indice-5, 45);
            big.drawString(texto.get(i).toString(), indice2-5, Alto-32);
            big.drawString(texto.get(i).toString(), indiceCi-5, Alto/2-12);
            
            Pos=Separacion*Math.log(texto.get(i)*10)/Math.log(2);
            indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
            big.drawString(texto.get(i).toString(), indice-5, 45);
        }

        double Pos=Separacion*Math.log(Math.PI)/Math.log(2);
        int indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        int indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
        for (int j=1;j<T2;j++) {
            img.setRGB(indice, j, color2);
            img.setRGB(indice2, Alto-j, color2);
        }

        big.drawString("\u03c0", indice-5, 35);
        big.drawString("\u03c0", indice2-5, Alto-25);
        /*
        Pos=Separacion*Math.log(Math.PI*10)/Math.log(2);
        indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        big.drawString("\u03c0", indice-5, 45);
        big.drawString("\u03c0", indice-5, Alto-45);
        */
        
        Pos=Separacion*Math.log(Math.E)/Math.log(2);
        indice= (int) (Math.round(Pos)+MargenI/2.54*ppp);
        indice2= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
        for (int j=1;j<T2;j++) {
            img.setRGB(indice, j, color2);
            img.setRGB(indice2, Alto-j, color2);
        }

        big.drawString("e", indice-5, 35);
        big.drawString("e", indice2-5, Alto-22);
        
        
        big.setFont(new Font("Arial", Font.PLAIN, 24));
        big.drawString("B", (int) (MargenI/2.54*ppp-30), 25);
        big.drawString("C", (int) (MargenI/2.54*ppp-30), Alto-15);
        big.drawString("Ci", (int) (MargenI/2.54*ppp-30), Alto/2+5);
        
        File f = new File("b.png");
        try {
            ImageIO.write(img, "PNG", f);
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
      
    }
    
    
    private static void DibujaInf() {
        
        int T1=30;
        ArrayList<Float> ar1 = new ArrayList();
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
        
        ArrayList<Integer> texto = new ArrayList();
        texto.add(1);
        texto.add(2);
        texto.add(3);
        texto.add(4);
        texto.add(5);
        texto.add(6);
        texto.add(7);
        texto.add(8);
        texto.add(9);
        
        
        int T2=20;
        ArrayList<Float> ar2 = new ArrayList();
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

        int T3=10;
        ArrayList<Float> ar3 = new ArrayList();
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
        
        int Ancho = (int) (Largo/2.54*ppp);
        int Alto=(int) (Altura/2.54*ppp);
        //System.out.println(Ancho+"x"+Alto);
        
        float Espacio=((Largo-MargenD-MargenI)/2.54f*ppp);
        //System.out.println(Espacio);
        
        
        BufferedImage img = new BufferedImage(Ancho, Alto, BufferedImage.TYPE_INT_RGB);
        
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


        
        Graphics big = img.getGraphics();
        big.setColor(Color.WHITE);
        big.fillRect(1, 1, Ancho-2, Alto-2);
        
        
        big.setColor(Color.BLACK);
        big.setFont(new Font("Arial", Font.PLAIN, 18));
        
        double Separacion=Espacio*Math.log(2)/Math.log(100);
        double SeparacionK=Espacio*Math.log(2)/Math.log(1000);
        //System.out.println(Separacion);

        // Lineas Principales
        for (int i=0;i<ar1.size();i++) {
            double Pos=Separacion*Math.log(ar1.get(i))/Math.log(2);
            double PosK=SeparacionK*Math.log(ar1.get(i))/Math.log(2);
            int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            for (int j=1;j<T1;j++) {
                img.setRGB(indice, j, color1);
                img.setRGB(indiceK, Alto-j, color1);
            }
             
            
            PosK=SeparacionK*Math.log(ar1.get(i)*10)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            for (int j=1;j<T1;j++) {
                img.setRGB(indiceK, Alto-j, color1);
            }
            
            PosK=SeparacionK*Math.log(ar1.get(i)*100)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            for (int j=1;j<T1;j++) {
                img.setRGB(indiceK, Alto-j, color1);
            }
            
        }
        
        // Lineas Secundarias
        for (int i=0;i<ar2.size();i++) {
            double Pos=Separacion*Math.log(ar2.get(i))/Math.log(2);
            double PosK=SeparacionK*Math.log(ar2.get(i))/Math.log(2);
            int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            for (int j=1;j<T2;j++) {
                img.setRGB(indice, j, col2);
                img.setRGB(indiceK, Alto-j, col2);
            }
            
            PosK=SeparacionK*Math.log(ar2.get(i)*10)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            for (int j=1;j<T2;j++) {
                img.setRGB(indiceK, Alto-j, col2);
            }      
            
            
            PosK=SeparacionK*Math.log(ar2.get(i)*100)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            for (int j=1;j<T2;j++) {
                img.setRGB(indiceK, Alto-j, col2);
            }           
             
            
        }

        // Lineas terciarias
        for (int i=0;i<ar3.size();i++) {
            double Pos=Separacion*Math.log(ar3.get(i))/Math.log(2);
            double PosK=SeparacionK*Math.log(ar3.get(i))/Math.log(2);
            int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            for (int j=1;j<T3;j++) {
                img.setRGB(indice, j, col3);
                img.setRGB(indiceK, Alto-j, col3);
            }
            
            PosK=SeparacionK*Math.log(ar3.get(i)*10)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            for (int j=1;j<T3;j++) {
                img.setRGB(indiceK, Alto-j, col3);
            }      
            
            
            PosK=SeparacionK*Math.log(ar3.get(i)*100)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            for (int j=1;j<T3;j++) {
                img.setRGB(indiceK, Alto-j, col3);
            }                
        }
        
        
        //Texto
        for (int i=0;i<texto.size();i++) {
            double Pos=Separacion*Math.log(texto.get(i))/Math.log(2);
            double PosK=SeparacionK*Math.log(texto.get(i))/Math.log(2);
            int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
            int indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);
            big.drawString(texto.get(i).toString(), indice-5, 45);
            big.drawString(texto.get(i).toString(), indiceK-5, Alto-32);
            
            PosK=SeparacionK*Math.log(texto.get(i)*10)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);   
            big.drawString(texto.get(i).toString(), indiceK-5, Alto-32);
            
            PosK=SeparacionK*Math.log(texto.get(i)*100)/Math.log(2);
            indiceK= (int) (Math.round(PosK)+MargenI/2.54*ppp);   
            big.drawString(texto.get(i).toString(), indiceK-5, Alto-32);
            
            
        }

        double Pos=Separacion*Math.log(Math.PI)/Math.log(2);
        int indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
        for (int j=1;j<T2;j++) {
            img.setRGB(indice, j, col2);
        }

        big.drawString("\u03c0", indice-5, 35);
        
        Pos=Separacion*Math.log(Math.E)/Math.log(2);
        indice= (int) (2*Math.round(Pos)+MargenI/2.54*ppp);
        for (int j=1;j<T2;j++) {
            img.setRGB(indice, j, col2);
        }

        big.drawString("e", indice-5, 35);
        
        
        big.setFont(new Font("Arial", Font.PLAIN, 24));
        big.drawString("D", (int) (MargenI/2.54*ppp-30), 25);
         big.drawString("K", (int) (MargenI/2.54*ppp-30), Alto-15);
        
        File f = new File("c.png");
        try {
            ImageIO.write(img, "PNG", f);
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
      
    }
    
    
    
    
    
}
