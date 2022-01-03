public class OddThread extends Thread{
    int a[],b[];
    public OddThread(int a[], int b[])
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        for(int i=1;i<a.length;i+=2)
            a[i] *= b[i];
    }
}
