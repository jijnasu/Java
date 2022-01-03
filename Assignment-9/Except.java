import java.util.Scanner;
class Except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of a and b: ");
        int a = sc.nextInt(), b = sc.nextInt();

        try
        {
            if(a-b==0)
                throw new ArithmeticException();
            else
                System.out.println("The result is: "+(double)a/(a-b));
        }
        catch(ArithmeticException e)
        {
            System.out.println(e+" Cannot divide by 0...Try another input...");
        }
        sc.close();
    }
}
