
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FormSwing extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,a,b,f;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JButton d;
	FormSwing(){
		
		a=new JLabel();
		a.setBounds(160,330,300,20);
		b=new JLabel();
		b.setBounds(160,350,300,20);
		f=new JLabel();
		f.setBounds(160,370,300,20);
		
		l1=new JLabel("REGISTRATION FORM: ");
		l1.setBounds(50,10,150,30);
		
		l2=new JLabel("FIRST NAME: ");
		l2.setBounds(40,50,120,20);
		tf1=new JTextField();
		tf1.setBounds(40,70,120,30);
		
		l3=new JLabel("MIDDLE NAME: ");
		l3.setBounds(170,50,120,20);
		tf2=new JTextField();
		tf2.setBounds(170,70,120,30);
		
		l4=new JLabel("LAST NAME: ");
		l4.setBounds(300,50,120,20);
		tf3=new JTextField();
		tf3.setBounds(300,70,120,30);
		
		l5=new JLabel("Date: ");
		l5.setBounds(40,120,120,20);
		tf4=new JTextField();
		tf4.setBounds(40,140,120,30);
		
		l6=new JLabel("Month: ");
		l6.setBounds(170,120,120,20);
		tf5=new JTextField();
		tf5.setBounds(170,140,120,30);
		
		l7=new JLabel("Year: ");
		l7.setBounds(300,120,120,20);
		tf6=new JTextField();
		tf6.setBounds(300,140,120,30);
		
		l8=new JLabel("Sex: ");
		l8.setBounds(40,190,120,20);
		tf7=new JTextField();
		tf7.setBounds(40,210,120,30);
		
		d=new JButton("Show");
		d.setBounds(185,250,90,50);
		d.addActionListener(this);
		
		Container c= this.getContentPane();
		
		c.add(tf1);
		c.add(tf2);
		c.add(tf3);
		c.add(tf4);
		c.add(tf5);
		c.add(tf6);
		c.add(tf7);
		c.add(d);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		c.add(l7);
		c.add(l8);
		c.add(a);
		c.add(b);
		c.add(f);
		
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		String s1=tf1.getText();
		String s2=tf2.getText();
		String s3=tf3.getText();
		String s4=tf4.getText();
		String s5=tf5.getText();
		String s6=tf6.getText();
		String s7=tf7.getText();
		if(e.getSource()==d){
			String result1="My name is "+s1+" "+s2+" "+s3;
			a.setText(result1);
			String result2="Dob- "+s4+"/"+s5+"/"+s6;
			b.setText(result2);
			String result3="Sex- "+s7;
			f.setText(result3);
		}
	}
	public static void main(String args[]){
		new FormSwing();
	}
}
