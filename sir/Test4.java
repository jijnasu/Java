import java.util.*;
class MyThread1 extends Thread
{
	int c[],sum,size;
	MyThread1(int s)
	{
		Scanner sc=new Scanner(System.in);
		size=s;
		System.out.println("Enter the elements for the array");
		c=new int[size];
		for(int i=0;i<size;i++)
		{
			
			c[i]=sc.nextInt();
		}
		
			
	}
			
	public void run()
	{
		for(int i=0;i<size;i++)
		{
			sum=sum+c[i];
		}
		
	}
	void show()
	{
		System.out.println("The output of first thread");
		// for(int i=0;i<size;i++)
		// {
		// 	//System.out.println(sum);
		// }
		System.out.println(sum);
		// System.out.println();
	}
	
}
class Test4
{
	public static void main(String args[])
	{
		
		System.out.println("Main thread started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no  of elements");
		int no=sc.nextInt();
		
				
		System.out.println("enter the no of threads");
		int not=sc.nextInt();
		
		
		MyThread1 t1[]=new MyThread1[not];
		int each=no/not;
		for(int i=0;i<not;i++)
		{
			t1[i]=new MyThread1(each);
			t1[i].start();
			try
			{
				t1[i].join();
				t1[i].show();
			}
			catch(Exception e)
			{
			}
		}
		
		System.out.println("Main thread ended");
		
		
	}
}