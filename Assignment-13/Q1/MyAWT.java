import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyAWT extends JFrame implements ActionListener
{
    JTextField t1,t2;
    JLabel l1,l2;
    JButton b;

    MyAWT()
    {
        super("MyFrame");
        t1 = new JTextField();
        t2 = new JTextField();

        l1 = new JLabel("Enter your Name: ");
        l2 = new JLabel("Output: ");

        b = new JButton("Click Here");
        
        l1.setBounds(70, 80, 150, 20);
        t1.setBounds(70,100,150,20);
        l2.setBounds(70, 130, 150, 20);
        t2.setBounds(70,150,150,20);
        b.setBounds(100,200,100,50);
        b.addActionListener(this);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        String s1 = t1.getText();
        if(e.getSource()==b)
            t2.setText("My Name: "+s1);
    }

    public static void main(String[] args) {
        new MyAWT();
    }
}