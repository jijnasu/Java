import java.util.Scanner;

class Reversenum
{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),res = 0;
        while(n!=0)
        {
            res = res * 10 + n%10;
            n /= 10;
        }
        System.out.println("Reverse of the number: " + res);
        sc.close();
    }
    
}
