import java.util.Scanner;

public class SyncSumArr
{
    public static int sum=0;
    
    public void findsum(int a[],int i, int j) 
    {
        synchronized(a)
        {
            System.out.print("Thread: Elements from "+i+" to "+(j-1));
            for(;i<j;i++)
                sum += a[i];

            System.out.println(" => Sum : "+sum);
        }
        
    }
}

class MyThread extends Thread
{
    int a[],i,j;
    SyncSumArr obj;

    MyThread(int a[],int i, int j,SyncSumArr obj)
    {
        this.a = a;
        this.i = i;
        this.j = j;
        this.obj = obj;
    }

    public void run()
    {
        obj.findsum(a,i,j);
    }

}

class SyncDriver
{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10},l = 10,th = 5,pth = 2;
        Scanner sc = new Scanner(System.in);

        // INPUTS:
        System.out.print("Enter the length of array: ");
        l = sc.nextInt();
        a = new int[l];
        System.out.print("Enter the array: ");
        for(int i=0;i<l;i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the no. of threads: ");
        th = sc.nextInt();
        pth = l/th;
        System.out.print("The array : ");
        for(int i=0;i<l;i++)
            System.out.print(a[i]+" ");
        System.out.println("\n");


        MyThread threads[] = new MyThread[th];
        SyncSumArr obj = new SyncSumArr();
        for(int i=0;i<th;i++)
        {
            threads[i] = new MyThread(a,i*pth,(i+1)*pth,obj);
            threads[i].start();
        }

        try 
        {
            for(int i=0;i<th;i++)
                threads[i].join();
        } 
        catch (Exception e) 
        {
                System.out.println("Thread Joining error...");
        }
        
        
        System.out.println("RESULT : "+SyncSumArr.sum);
        sc.close();
    }
}