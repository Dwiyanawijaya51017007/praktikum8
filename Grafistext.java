/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafistext;
import java.awt.*;

/**
 *
 * @author asus
 */
public class Grafistext extends Panel{
    Font f;
    String text = "HALO KHARISMA";
    Grafistext() {
        setBackground(Color.GRAY);
    }
    public void paint(Graphics g){
        f = new Font ("Helvetica", Font.BOLD,48);
        //kontak hijau
        g.setColor(Color.GREEN);
        g.fillRect(8, 8, 335, 105);
        //warnahitam pinggiran
        g.setColor(Color.BLACK);
        g.drawRect(8, 8, 335, 105);
        g.setColor(Color.pink);
        g.fillOval(10, 10, 330, 100);
        //diberi pinggiran wara merah tebal (3x)
        g.setColor(Color.red);
        g.drawOval(10, 10, 330, 100);
        g.drawOval(9, 9, 332, 102);
        g.drawOval(8, 8, 334, 104);
        //tulisan warna hitam dengan font helvetica
        g.setColor(Color.black);
        g.setFont(f);
        g.drawString(text, 40, 75);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame f = new Frame ("Testing Graphics Panel");
        Grafistext gp = new Grafistext();
        f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
        // TODO code application logic here
    }
    
}
