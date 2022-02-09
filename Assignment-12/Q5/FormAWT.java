import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

public class FormAWT extends Frame {

    Label l0,l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4,t5,t6;

    public FormAWT() {
        setTitle("Application Form");
        setSize(500,350);
        setVisible(true);
        setLayout(null);
        setBackground(Color.gray);

        //Label
        l0 = new Label("Application Form");
        l0.setForeground(new Color(13, 17, 55));
        l0.setFont(new Font("Helvetica",Font.BOLD,40));
        l0.setBounds(100,20,330,70);

        l1 = new Label("Name: ");
        l1.setBounds(70,100,50,20);
        l1.setForeground(new Color(13, 17, 55));
        l1.setFont(new Font("Arial",Font.BOLD,15));

        l2 = new Label("Age: ");
        l2.setBounds(70,130,50,20);
        l2.setForeground(new Color(13, 17, 55));
        l2.setFont(new Font("Arial",Font.BOLD,15));

        l3 = new Label("Sex: ");
        l3.setBounds(70,160,50,20);
        l3.setForeground(new Color(13, 17, 55));
        l3.setFont(new Font("Arial",Font.BOLD,15));

        l4 = new Label("Date Of Birth: ");
        l4.setBounds(70,190,110,20);
        l4.setForeground(new Color(13, 17, 55));
        l4.setFont(new Font("Arial",Font.BOLD,15));

        l5 = new Label("Email Id: ");
        l5.setBounds(70,220,80,20);
        l5.setForeground(new Color(13, 17, 55));
        l5.setFont(new Font("Arial",Font.BOLD,15));

        l6 = new Label("Year: ");
        l6.setBounds(70,250,50,20);
        l6.setForeground(new Color(13, 17, 55));
        l6.setFont(new Font("Arial",Font.BOLD,15));

        add(l0);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);

        //Textarea
        t1 = new TextField();
        t1.setBounds(120,100,150,20);
        t1.setBackground(Color.lightGray);

        t2 = new TextField();
        t2.setBounds(120,130,30,20);
        t2.setBackground(Color.lightGray);

        t3 = new TextField();
        t3.setBounds(120,160,39,21);
        t3.setBackground(Color.lightGray);

        t4 = new TextField();
        t4.setBounds(178,190,100,20);
        t4.setBackground(Color.lightGray);

        t5 = new TextField();
        t5.setBounds(150,220,190,20);
        t5.setBackground(Color.lightGray);

        t6 = new TextField();
        t6.setBounds(120,250,60,22);
        t6.setBackground(Color.lightGray);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);

        Button btn = new Button("Submit");
        btn.setBounds(120,290,50,30);
        btn.setBackground(Color.green);
        add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String age = t2.getText();
                String sex = t3.getText();
                String dob = t4.getText();
                String emailId = t5.getText();
                String year = t6.getText();

                try{
                    FileWriter writer = new FileWriter("Application Form.txt",true);
                    writer.write(System.getProperty("line.separator"));
                    writer.write("" + name + " " + age + " " + sex + " " + dob + " " + emailId + " " + year );
                    writer.write(System.getProperty("line.separator"));
                    writer.close();
                }
                catch (Exception ex){
                    System.out.println("There is something wrong");
                }
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new FormAWT();
    }
}