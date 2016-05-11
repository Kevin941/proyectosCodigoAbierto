/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujavector;

import de.erichseifert.vectorgraphics2d.EPSGraphics2D;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    
    
    public static void main(String[] args) throws IOException {
        // Create a new PDF document with a width of 210 and a height of 297
        EPSGraphics2D g = new EPSGraphics2D(0.0, 0.0, 210.0, 297.0);

        // Draw a red ellipse at the position (20, 30) with a width of 100 and a height of 150
        g.setColor(Color.RED);
        g.fillOval(20, 30, 100, 150);

        try (FileOutputStream file = new FileOutputStream("ellipse.eps")) {
            file.write(g.getBytes());
        }
    }
}