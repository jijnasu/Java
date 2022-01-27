import java.util.*;
// public class sumWuthSync{
// 	public static int sum=0;
// 	public void add(int n,int m){
// 		synchronized(this){
//             for(int i=n;i<m;i++)
//                 sum+=i;
// 			System.out.print("Thread "+n/(m-n)+"sum: "+sum);
// 		}
// 	}
// }
class sumThread extends Thread{
    int n,m;
    public static int sum=0;
    sumThread(int n,int m){
        this.n=n;
        this.m=m;
    }
	public void add(int n,int m){
		synchronized(this){
            for(int i=n;i<m;i++)
                sum+=i;
			System.out.println("Thread "+n/(m-n)+"sum: "+sum);
		}
	}
    public void run(){
		add(n,m);
	}
}
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the no. of natural no.: ");
        n=sc.nextInt();
        System.out.println("Enter the no. of threads required: ");
        m=sc.nextInt();
        int l = (n/m);
        sumThread thArr[]=new sumThread[m];
        for (int i = 0;i<m;i+=1) {
            thArr[i]=new sumThread(i*l+1,(i+1)*l+1);
            thArr[i].start();
            try
            {
                thArr[i].join();
            }
            catch(Exception e)
            {

            }
        }
        System.out.println("final sum: "+ sumThread.sum);
    }
}
