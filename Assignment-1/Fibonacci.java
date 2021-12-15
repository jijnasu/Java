import java.util.*;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int l = sc.nextInt();
        System.out.print("Ficonacci series : ");
        printfibo(l);
        sc.close();
    }
    public static void printfibo(int l) {
        int i=0, a=0, b=1;
        for(;i<l;i++)
        {
            System.out.print(a+", ");
            b = a+b;
            a = b-a;
        }
        System.out.println();
    }
}
