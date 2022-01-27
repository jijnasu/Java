import java.awt.*;
import java.awt.event.*;

import javax.swing.WindowConstants;

public class MySmiley extends Frame// implements ActionListener
{

    MySmiley()
    {
        // Graph
        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(400,400);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 200, 200);
        g.setColor(Color.black);
        g.fillOval(135, 155, 30, 40);
        g.fillOval(235, 155, 30, 40);
        g.drawLine(200, 190, 180, 230);
        g.drawLine(200, 190, 220, 230);
        g.drawLine(180, 230, 220, 230);
        g.drawArc(140, 140, 120, 120, 220, 100);
        int x[] = {153,163,153}, y[] ={238,248,238};
        g.drawLine(153, 238, 153, 265);
        g.drawLine(163, 248, 153, 265);
        g.setColor(Color.red);
        g.fillPolygon(x,y,3);
        g.drawLine(400-153, 238, 400-153, 265);
        g.drawLine(400-163, 248, 400-153, 265);
        
    }
    
    public static void main(String[] args) {
        new MySmiley();
    }
}
