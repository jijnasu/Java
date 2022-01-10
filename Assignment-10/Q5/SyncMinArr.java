import java.util.Scanner;

public class SyncMinArr
{
    public static int minimum=0;
    public int min=0;

    public int min(int x,int y)
    {
        // synchronized(this)
        // {
            if(x<y)
                return x;
            return y;

        // }
    }

    public void findmin(int a[],int i, int j) 
    {
        synchronized(a)
        {
            System.out.print("Thread: Elements from "+i+" to "+(j-1));
            min = a[i];
            for(;i<j;i++)
                min = min(a[i],min);
            minimum = min(min,minimum);
            System.out.println(" => Min : "+min);
        }
        
    }
}

class MyThread extends Thread
{
    int a[],i,j;
    SyncMinArr obj;

    MyThread(int a[],int i, int j,SyncMinArr obj)
    {
        this.a = a;
        this.i = i;
        this.j = j;
        this.obj = obj;
    }

    public void run()
    {
        obj.findmin(a,i,j);
    }

}

class SyncMinDriver
{
    public static void main(String[] args) {
        int a[] = {15,25,35,4,5,6,7,8,9,10},l = 10,th = 5,pth = 2;
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

        SyncMinArr.minimum = a[0];
        MyThread threads[] = new MyThread[th];
        SyncMinArr obj = new SyncMinArr();
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
        
        
        System.out.println("RESULT : "+SyncMinArr.minimum);
        sc.close();
    }
}