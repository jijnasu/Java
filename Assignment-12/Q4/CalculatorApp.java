import java.awt.*;
import java.awt.event.*;
import java.util.logging.Formatter;
import javax.swing.*;
public class CalculatorApp extends JFrame implements ActionListener{
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4,bt;
    int a=0,b=1,f=0;
    CalculatorApp(){
        a=0;b=1;f=0;
        
        JLabel l1 = new JLabel("Display: "); 
            l1.setBounds(50,50,50,20);
        JLabel l2 = new JLabel("num2: "); 
            l2.setBounds(50,100,50,20);
        JLabel l3 = new JLabel("result: "); 
            l3.setBounds(50,150,50,20);    
        tf1=new JTextField();
        tf1.setBounds(100,50,150,20);
        tf2=new JTextField();
        tf2.setBounds(100,100,150,20);
        tf3=new JTextField();
        tf3.setBounds(100,150,150,20);
        tf3.setEditable(false);
        b1=new JButton("+");
        b1.setBounds(100,200,50,50);
        b2=new JButton("-");
        b2.setBounds(150,200,50,50);
        b3=new JButton("/");
        b3.setBounds(200,200,50,50);
        b4=new JButton("%");
        bt=new JButton("OK");
        b4.setBounds(250,200,50,50);
        bt.setBounds(300,200,100,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        bt.addActionListener(this);
        add(l1);//add(l2);add(l3);
        add(b1);add(b2);add(b3);add(b4);
        add(bt);
        add(tf1);//add(tf2);add(tf3);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing (WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        String s1=tf1.getText();
        // int a=0,b=1,f=0;
        if(e.getSource()==bt)
        if(f==0)
        {
            a = Integer.parseInt(tf1.getText());
            f+=1;
            tf1.setText("");
        }
        else
        {
            b = Integer.parseInt(tf1.getText());
            f+=1;
            tf1.setText("");

        }

            

        
        
        
        
        // String s1=tf1.getText();
        // String s2=tf2.getText();
        // int a = Integer.parseInt(s1);
        // int b = Integer.parseInt(s2);
        String res;
        float c=0;
        // if(f==2)
        // {

            if(e.getSource()==b1){
                c=a+b;
                res=String.valueOf(c);
                tf1.setText(res);
                a=b=f=0;
            }
            else if(e.getSource()==b2){
                c=a-b;
                res=String.valueOf(c);
                tf1.setText(res);
                a=b=f=0;
            }
            else if(e.getSource()==b3){
                c=(float)a/b;
                res=String.valueOf(c);
                tf1.setText(res);
                a=b=f=0;
            }
            else if(e.getSource()==b4){
                c=a%b;
                res=String.valueOf(c);
                tf1.setText(res);
                a=b=f=0;
            }
            
        // }
    }
    public static void main(String[] args) {
        new CalculatorApp();
    }
}