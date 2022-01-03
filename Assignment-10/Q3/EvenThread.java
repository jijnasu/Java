public class EvenThread extends Thread{
    int a[],b[];
    public EvenThread(int a[], int b[])
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        for(int i=0;i<a.length;i+=2)
            a[i] *= b[i];
    }
}
