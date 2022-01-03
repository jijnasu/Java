public class SqThread extends Thread {
    int n;
    public SqThread(int n)
    {
        this.n=n;
    }

    public void run()
    {
        System.out.println("square : "+(n*n));
    }
}