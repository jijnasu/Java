import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChangeColor extends JFrame implements ActionListener{
    JTextField text = new JTextField("COLOR CHANGING PROGRAM !");
    JButton red,green,blue,red2,green2,blue2;
    ChangeColor(){
        setSize(600,600);
        setLayout(null);
        setTitle("ColorApp");
        setVisible(true);

        text.setBounds(50, 100, 300, 20);
        
        red2 = new JButton("B-Red");
        green2 = new JButton("B-Green");
        blue2 = new JButton("B-Blue");
        red = new JButton("F-Red");
        green = new JButton("F-Green");
        blue = new JButton("F-Blue");
        
        
        red.setBounds(50, 200, 80, 20);
        green.setBounds(120+30, 200, 80, 20);
        blue.setBounds(190+60, 200, 80, 20);
        red2.setBounds(50, 240, 80, 20);
        green2.setBounds(120+30, 240, 80, 20);
        blue2.setBounds(190+60, 240, 80, 20);
        
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        red2.addActionListener(this);
        green2.addActionListener(this);
        blue2.addActionListener(this);

        
        add(text);
        add(red);
        add(blue);
        add(green);
        add(red2);
        add(blue2);
        add(green2);
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == red2){
            text.setBackground(Color.red);
        }
        else if(e.getSource() == green2){
            text.setBackground(Color.green);
        }
        else if(e.getSource() == blue2){
            text.setBackground(Color.blue);
       }
       if(e.getSource() == red){
            text.setForeground(Color.red);
        }
        else if(e.getSource() == green){
            text.setForeground(Color.green);
        }
        else if(e.getSource() == blue){
            text.setForeground(Color.blue);
       }
       
    }
    public static void main(String[] args) {
        new ChangeColor();
    }
}
