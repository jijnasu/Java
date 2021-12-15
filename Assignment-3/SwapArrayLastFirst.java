import java.util.Random;
import java.util.Scanner;
class SwapArrayLastFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = sc.nextInt();
        int a[]=new int[l],b[]=new int[l], k = 0;
        System.out.println("Before SWAPPING the array are : ");
        System.out.print("The first array is : ");
        Random r = new Random();
        for(int i=0;i<l;i++)
        {
            a[i] = r.nextInt(0, 2);
            b[i] = r.nextInt(0, 2);
            System.out.print(a[i]+", ");
        }
        System.out.print("\nThe second array is : ");
        for(int i=0;i<l;i++)
        {
            System.out.print(b[i]+", ");
            if(i>=l/2)
            {
                k = a[i];
                a[i] = b[i];
                b[i] = k;
            }
        }
            
        System.out.print("\nAfter SWAPPING the array are : ");
        System.out.print("\nThe first array is : ");
        for(int i=0;i<l;i++)
            System.out.print(a[i]+", ");
        System.out.print("\nThe second array is : ");
        for(int i=0;i<l;i++)
            System.out.print(b[i]+", ");
        System.out.println();
        
        sc.close();
        
    }
}
