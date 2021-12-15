import java.util.Scanner;
class MatrixMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = sc.nextInt();
        int a[][] = new int[l][l],b[][] = new int[l][l],c[][] = new int[l][l],t=0;
        System.out.println("Enter first Matrix : ");
        for(int i=0;i<l;i++)
            for(int j=0;j<l;j++)
                a[i][j] = sc.nextInt();
        
        System.out.println("Enter second Matrix : ");
        for(int i=0;i<l;i++)
            for(int j=0;j<l;j++)
                b[i][j] = sc.nextInt();
        
        
        System.out.println("The first Matrix is : ");
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
                System.out.print(a[i][j]+"  ");
            System.out.println();
        }
        System.out.println("\nThe second Matrix is : ");
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
                System.out.print(b[i][j]+"  ");
            System.out.println();
        }
        
        for(int i=0;i<l;i++)
            for(int j=0;j<l;j++)
            {
                c[i][j] = 0;
                for(int k=0;k<l;k++)
                    c[i][j] += a[i][k]*b[k][j];
            }
        
        System.out.println("\nThe Matrix Multiplication is : ");
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
                System.out.print(c[i][j]+"  ");
            System.out.println();
        }
        
        sc.close();
    }
}
