import java.util.*;
class MeanMaxMid
{
    public static void main(String args[])
	{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int x[]=new int[n], sum=0,max=0;
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<x.length;i++)
                x[i]=sc.nextInt();
        max = x[0];
        for(int i=0; i<x.length; i++ )
        {
            sum+=x[i];
            if(max<x[i])
                max=x[i];
        }
        int mid=x[x.length/2];
        float mean=sum/x.length;
        System.out.println("So, MEAN = "+mean+", MAXIMUM = "+max+", MIDDLE = "+mid);
        sc.close();
    }    
}