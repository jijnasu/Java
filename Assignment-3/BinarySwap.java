import java.util.*;
class BinarySwap
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        int b[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int i,c=0;
        System.out.println("Enter either 1 or 0 in the 1st array");
        for(i=0;i<10;i++)
        a[i]=sc.nextInt();
        System.out.println("Enter either 1 or 0 in the 2nd array");
        for(i=0;i<10;i++)
        b[i]=sc.nextInt();
        System.out.println("Before Flipping array elements of 1st array: ");
        for(i=0;i<10;i++)
        System.out.print(a[i]+" ");
        System.out.println("\nBefore Flipping array elements of 2nd array: ");
        for(i=0;i<10;i++)
        System.out.print(b[i]+" ");
        c=a[4];
        a[4]=b[2];
        b[2]=c;
        c=a[6];
        a[6]=b[3];
        b[3]=c;
        c=a[7];
        a[7]=b[4];
        b[4]=c;
        System.out.println("\nAfter Flipping array elements : ");
        for(i=0;i<10;i++)
            System.out.print(a[i]+" ");
            System.out.println("\nAfter Flipping array elements : ");
        for(i=0;i<10;i++)
            System.out.print(b[i]+" ");
   }

}