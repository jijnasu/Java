import java.util.*;
class Global
{
		static int a[];
		Global()
		{
			a=new int[10];
		}
	 	void update(int index,int n) 
		{
			
			a[index]=n;
			
		}
	
}
class MyThread1 extends Thread
{
	Global g2;
	MyThread1(Global g1)
	{
		g2=g1;
		
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			
			
			try
			{
				g2.update(i,i*i);
				Thread.sleep(100);
			}
			catch(Exception e){}
			
		}
	}
}
class MyThread2 extends Thread
{
	Global g2;
	MyThread2(Global g1)
	{
		g2=g1;
		
	}
	
	public void run()
	{
		for(int i=5;i<10;i++)
		{
			
			
			try
			{
				g2.update(i,i*i);
				Thread.sleep(100);
			}
			catch(Exception e){}
			
		}
	}
}	
		
		
class Test6
{
	public static void main(String args[])
	{
			
		
		Global g1=new Global();
		MyThread1 t1=new MyThread1(g1);
		MyThread2 t2=new MyThread2(g1);
		 t1.start();
		 try
		 {
			 t1.join();
		 }
		 
		 catch(Exception e){}
		 t2.start();
		 try
		 {
			 t2.join();
		 }
		 catch(Exception e){}
		 
		   for(int i=0;i<10;i++)
		   {
		 System.out.print(g1.a[i]); 
		   }
		
	 
		
	}
}
		
	