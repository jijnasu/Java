import java.util.*;
class SmallerGreater
{
    public static void main(String args[])
	{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int x[]=new int[n];

        System.out.print("Enter the elements of array : ");
        for(int i=0;i<x.length;i++)
                x[i]=sc.nextInt();
        
        for(int i=0;i<x.length;i++)
            for(int j=0;j<x.length - i - 1;j++)
                if(x[j]>x[j+1])
                    swap(x,j,j+1);
    
        System.out.print("The sorted array is : ");
        for(int i=0;i<x.length;i++)
            System.out.print(x[i]+", ");
        int mid=x.length/2;
        System.out.println("\nThe middle element is : "+x[mid]);
        System.out.print("The elements smaller than " +x[mid] +" are :  ");
        for(int i=0;i<x.length/2;i++)
            if(x[i]<x[mid])
                System.out.print(x[i]+", ");
        
        System.out.print("\nThe elements greater than " +x[mid] +" are :  ");
        for(int i=x.length/2;i<x.length;i++)
            if(x[i]>x[mid])
                System.out.print(x[i]+", ");
        System.out.println();
        sc.close();
    }

    public static void swap(int a[],int i,int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}