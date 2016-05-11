package dibujapng;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author lelguea
 */
public class Uno {
    
    public static void main(String[] asdad) {
        
        BufferedImage img = new BufferedImage(960, 960, 
                BufferedImage.TYPE_INT_RGB);
        
        int r = 125;
        int g = 0;
        int b = 0;
        int casirojo = (r << 16) | (g << 8) | b;
        

        r = 245;
        g = 245;
        b = 245;
        int casiblanco = (r << 16) | (g << 8) | b;
        
        
        Graphics gr = img.getGraphics();
        gr.setColor(Color.RED);
        gr.fillRect(400, 400, 496, 496);
        
        gr.setColor(new Color(casirojo));
        gr.setFont(new Font("Arial", Font.PLAIN, 28));

         for (double i=-8;i<8;i=i+.1) {
             
             int x= (int) ((i*50)+500);
             int y=(int) ((1+Math.sin(i))*200);
             System.out.println(x+","+y);
             img.setRGB(x, y, casiblanco);
         }

         gr.drawString("Hola", 200, 145);
                 
        File f = new File("uno.png");
        try {
            ImageIO.write(img, "PNG", f);
        } catch (IOException ex) {
            System.err.println(ex.toString());
        }
    }
    
}
