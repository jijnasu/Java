import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String("india is great");
        System.out.print("Enter the string: ");
        s=sc.nextLine();


        String ar[]=s.split("");
        ar[0] = ar[0].toUpperCase();
        for(int i=0;i<ar.length;i++)
            if(ar[i].compareTo(" ")==0 && i+1<ar.length)
                ar[i+1]=ar[i+1].toUpperCase();
                
        s = String.join("", ar);
        System.out.println(s);

    }
}
