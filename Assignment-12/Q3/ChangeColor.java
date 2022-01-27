import java.awt.*;
import java.awt.event.*;

public class ChangeColor extends Frame implements ActionListener{
    TextField text = new TextField("COLOR CHANGING PROGRAM !");
    Button red,green,blue,red2,green2,blue2;
    ChangeColor(){
        setSize(400,400);
        setLayout(null);
        setTitle("ColorApp");
        setVisible(true);

        text.setBounds(50, 100, 300, 20);
        
        red2 = new Button("B-Red");
        green2 = new Button("B-Green");
        blue2 = new Button("B-Blue");
        red = new Button("F-Red");
        green = new Button("F-Green");
        blue = new Button("F-Blue");
        
        
        red.setBounds(50, 200, 60, 20);
        green.setBounds(120, 200, 60, 20);
        blue.setBounds(190, 200, 60, 20);
        red2.setBounds(50, 240, 60, 20);
        green2.setBounds(120, 240, 60, 20);
        blue2.setBounds(190, 240, 60, 20);
        
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
