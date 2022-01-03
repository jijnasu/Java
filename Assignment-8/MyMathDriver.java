import java.util.Scanner;
import btech.arithmetic.MyMath;
class MyMathDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a,b,ans;
        System.out.print("Enter the two no.s : ");
        a = sc.nextInt();
		b = sc.nextInt();
        MyMath m1 = new MyMath(a,b);
        System.out.println("the sum of both the no.s is : "+m1.doSum());
    }
}