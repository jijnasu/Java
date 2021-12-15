import java.util.*;

class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = sc.nextInt();
        int arr[]=new int[l];
        System.out.print("Enter the array : ");
        for(int i=0;i<l;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<l;i++)
            for(int j=0;j<arr.length - i - 1;j++)
                if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
            
        System.out.print("After sorting the array is: ");
        for(int i=0;i<l;i++)
            System.out.print(arr[i]+", ");
        System.out.println();
        sc.close();
    }

    public static void swap(int a[],int i,int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
