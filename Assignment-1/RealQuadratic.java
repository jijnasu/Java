import java.util.*;
import java.lang.Math;
class RealQuadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the coefficients(ax2+bx+c=0) : ");
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        int d = b*b - 4*a*c;
        if(d>=0)
            System.out.println("The roots are : "+(-b+Math.sqrt(d))/2/a+" and "+(-b-Math.sqrt(d))/2/a);
        else
            System.out.println("The roots are imaginary...");
        sc.close();
    }
}
