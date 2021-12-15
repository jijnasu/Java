import java.util.Scanner;

class Sumdig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt(), res = 0;
        while(n!=0)
        {
            res += n%10;
            n/=10;
        }
        System.out.println("Sum of the digits is : "+res);
        sc.close();
    }
}
