import java.util.Scanner;

public class EvenThread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two no.s: ");
        int m=sc.nextInt(), n=sc.nextInt();
        OddThread thread1 = new OddThread(m,n);
        thread1.start();
        for(int i=m;i<n;i++){
            if(i%2!=0){
                System.out.println("parent : "+i);
            }    
        }
    }
}