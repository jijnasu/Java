
import java.util.Scanner;

import btech.arithmatic.MyMath;

class test2{
    public static void main(String args[]){

        Scanner in = new Scanner (System.in);

        double res=0;

        System.out.println("Enter two numbers : ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        
        MyMath meth = new MyMath(a,b);
        
        System.out.println("Addition :"+meth.add());
        System.out.println("Subtraction :"+meth.sub());
        System.out.println("Multipy :"+meth.mul());
        System.out.println("Divide :"+meth.div());
        System.out.println("Mod :"+meth.mod());

        
        

    }
}