import java.util.Scanner;
class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = sc.nextInt();
        int a[][] = new int[l][l],b[][] = new int[l][l];
        System.out.println("Enter the Matrix : ");
        for(int i=0;i<l;i++)
            for(int j=0;j<l;j++)
                a[i][j] = sc.nextInt();
        
         
        System.out.println("The Matrix is : ");
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
                System.out.print(a[i][j]+"  ");
            System.out.println();
        }
        
        for(int i=0;i<l;i++)
            for(int j=0;j<l;j++)
                b[i][j] = a[j][i];
        
        System.out.println("\nThe transpose of the Matrix is : ");
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
                System.out.print(b[i][j]+"  ");
            System.out.println();
        }
        sc.close();
        
    }
}
