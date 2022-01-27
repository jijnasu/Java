import java.awt.*;
import java.awt.event.*;
public class MyAWT extends Frame implements ActionListener{
        Button b;
        TextField tf1,tf2;
        MyAWT()
        {
            Label l1 = new Label("Enter Your name:");
            Label l2 = new Label("Your name is:");
            l1.setBounds(70, 80, 150, 20);
            tf1=new TextField();
            tf1.setBounds(70,100,150,20);
            l2.setBounds(70, 130, 150, 20);
            tf2=new TextField();
            tf2.setBounds(70,150,150,20);
            b=new Button("click here");
            b.setBounds(100,200,100,50);
            b.addActionListener(this);
            add(l1);
            add(tf1);
            add(l2);
            add(tf2);
            add(b);
            setSize(400,400);
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
            if(e.getSource()==b){
                tf2.setText("my name: "+s1);
            }
        }
        public static void main(String[] args) {
            new MyAWT();
        }
}