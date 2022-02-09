import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
// import javax.swing.text.AttributeSet.ColorAttribute;

public class CalculatorApp extends JFrame implements ActionListener
{
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bi,bd,bdot,be,back,clr;
    String s="";
    char opr='a';
    double x,y,res,var,temp=0,xdone=0;
        
    CalculatorApp()
    {
        int lm=50,ld=40,ll=60,lh=30,lbw=50;//l=500,b=500,
        t = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bp = new JButton("+");
        bm = new JButton("-");
        bi = new JButton("X");
        bd = new JButton("/");
        bdot = new JButton(".");
        be = new JButton("=");
        back = new JButton("back");
        clr = new JButton("AC");

        

        t.setBounds(lm, lm, ll*3+lbw, lh);

        back.setBounds(lm, lm+ld, lbw+ll, lh);
        clr.setBounds(lm+ll*2, lm+ld, lbw+ll, lh);
        
        b1.setBounds(lm, lm+ld*2, lbw, lh);
        b2.setBounds(lm+ll, lm+ld*2, lbw, lh);
        b3.setBounds(lm+ll*2, lm+ld*2, lbw, lh);
        bp.setBounds(lm+ll*3, lm+ld*2, lbw, lh);

        b4.setBounds(lm, lm+ld*3, lbw, lh);
        b5.setBounds(lm+ll, lm+ld*3, lbw, lh);
        b6.setBounds(lm+ll*2, lm+ld*3, lbw, lh);
        bm.setBounds(lm+ll*3, lm+ld*3, lbw, lh);

        b7.setBounds(lm, lm+ld*4, lbw, lh);
        b8.setBounds(lm+ll, lm+ld*4, lbw, lh);
        b9.setBounds(lm+ll*2, lm+ld*4, lbw, lh);
        bi.setBounds(lm+ll*3, lm+ld*4, lbw, lh);

        bdot.setBounds(lm, lm+ld*5, lbw, lh);
        b0.setBounds(lm+ll, lm+ld*5, lbw, lh);
        be.setBounds(lm+ll*2, lm+ld*5, lbw, lh);
        bd.setBounds(lm+ll*3, lm+ld*5, lbw, lh);
        

        add(t);  add(b1);  add(b2);  add(b3);  add(b4);  add(b5);  add(b6);  add(b7);  add(b8);  add(b9);  add(bp);  add(bm);  add(bi);  add(bdot);  add(b0);  add(be);  add(bd);  add(back);  add(clr);
        t.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bp.addActionListener(this);
        bm.addActionListener(this);
        bi.addActionListener(this);
        bdot.addActionListener(this);
        b0.addActionListener(this);
        be.addActionListener(this);
        bd.addActionListener(this);
        back.addActionListener(this);
        clr.addActionListener(this);
        



        setSize(lm*2+ll*4,lm*2+ll*5);
        setLayout(null);
        setVisible(true);
        // this.setBackground(Color.black);
        // setBackground(Color.black);
        getContentPane().setBackground(Color.darkGray);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            s = s+"1";
            t.setText(s);
        }
        if(e.getSource()==b2){
            s = s+"2";
            t.setText(s);
        }
        if(e.getSource()==b3){
            s = s+"3";
            t.setText(s);
        }
        if(e.getSource()==b4){
            s = s+"4";
            t.setText(s);
        }
        if(e.getSource()==b5){
            s = s+"5";
            t.setText(s);
        }
        if(e.getSource()==b6){
            s = s+"6";
            t.setText(s);
        }
        if(e.getSource()==b7){
            s = s+"7";
            t.setText(s);
        }
        if(e.getSource()==b8){
            s = s+"8";
            t.setText(s);
        }
        if(e.getSource()==b9){
            s = s+"9";
            t.setText(s);
        }
        if(e.getSource()==b0){
            s = s+"0";
            t.setText(s);
        }
        if(e.getSource()==bdot){
            s = s+".";
            t.setText(s);
        }
        if(e.getSource()==bp){operate(opr);opr = '+';}
        if(e.getSource()==bm){operate(opr);opr = '-';}
        if(e.getSource()==bi){operate(opr);opr = '*';}
        if(e.getSource()==bd){operate(opr);opr = '/';}
        if(e.getSource()==be){operate(opr);xdone = 0;}
        if(e.getSource()==back){  s = t.getText();  s=s.substring(0, s.length()-1);  t.setText(s);}
        if(e.getSource()==clr){t.setText("");s="";xdone = 0;}
    }
    
    int operate(char opr)
    {
        if(xdone==0)
        {
            s = t.getText();
            x = Double.parseDouble(s);
            xdone = 1;
            s = "";
            t.setText(s);
        }
        else
        {
            y = Double.parseDouble(s);
            if(opr=='+')
                x += y;
            else if(opr=='-')
                x -= y;
            else if(opr=='*')
                x *= y;
            else if(opr=='/')
                if(y==0)
                {
                    t.setText("Undefined...");
                    return 0;
                }
                else
                    x /= y;
            else
            {
                t.setText("Invalid operator...");
                return 0;
            }
            s = Double.toString(x);
            t.setText(s);
            s = "";
        }
        return 0;
    }
    public static void main(String[] args) {
        new CalculatorApp();
    }
    
}
