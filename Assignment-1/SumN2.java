import java.util.*;
class SumN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt(), sum = 0;
        for(int i=1;i<=n;i++)
            sum += (i*i);
        System.out.println("The sum of the n terms is : "+sum);
        sc.close();
    }
}
