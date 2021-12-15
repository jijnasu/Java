import java.util.*;
class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        System.out.println("The sum of the n terms is : "+n*(n+1)/2);
        sc.close();
    }
}
