public class Q3Test {
    public static void main(String[] args) {
         int a[]={1,2,3,4,5},b[]={5,4,3,2,1};
         OddThread ot = new OddThread(a,b);
         EvenThread et = new EvenThread(a,b);
         ot.start();
         et.start();
         for (int v : a) {
             System.out.print(v+" ");
             
         }
    }
}
