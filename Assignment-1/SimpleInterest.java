import java.util.*;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal, Rate and Interest : ");
        int p=sc.nextInt(), r=sc.nextInt(), t=sc.nextInt();
        System.out.println("The Simple Interest is : "+p*r*t/100);
        sc.close();
    }
}
