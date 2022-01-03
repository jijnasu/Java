public class OddThread extends Thread {
    int m,n;
    public OddThread(int m,int n){
        this.m=m;
        this.n=n;
    }
    public void run(){
        for(int i=m;i<n;i++){
            if(i%2==0){
                System.out.println("child : "+i);
            }
        } 
    }
}