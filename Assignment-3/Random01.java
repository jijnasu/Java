import java.util.Random;
import java.util.Scanner;
class Random01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = sc.nextInt();
        int arr[]=new int[l];
        System.out.print("The array is : ");
        Random r = new Random();
        for(int i=0;i<l;i++)
        {
            arr[i] = r.nextInt(0, 2);
            System.out.print(arr[i]+", ");
        }
        System.out.print("\nAfter complement the array is : ");
        for(int i=0;i<l;i++)
        {
            arr[i] = (arr[i]+1)%2;
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        sc.close();
        
    }
}
