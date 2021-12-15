import java.util.Scanner;
class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = sc.nextInt(),mains=0,rights=0;
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
            {
                if(i==j)
                    mains += a[j][i];
                if(i+j==l-1)
                    rights += a[i][j];
            }    
        
        System.out.println("\nThe sum of main diagonal is : "+mains);
        System.out.println("The sum of right diagonal is : "+rights);
        sc.close();
        
    }
}
