public class SumOfSqThread extends Thread{
    int n;

    public SumOfSqThread(int n) {
        this.n = n;
    }
    
    public void run()
    {
        int res=0;
        n *= n;
        while(n>0)
        {
            res += n%10;
            n /= 10;
        }
        System.out.println("Sum of digits of square of number : "+res);
    }
}
