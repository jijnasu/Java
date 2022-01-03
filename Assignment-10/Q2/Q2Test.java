public class Q2Test {
    public static void main(String args[]) {
        int n=5;
        SqThread th=new SqThread(n);
        SumOfSqThread sth=new SumOfSqThread(n);
        th.start();
        sth.start();
    }
}