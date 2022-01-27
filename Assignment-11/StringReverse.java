import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=sc.nextLine();
        
        System.out.print("Reverse the string: ");
        for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
    }
}
