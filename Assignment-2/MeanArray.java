import java.util.*;
class MeanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = sc.nextInt();
        int arr[]=new int[l],mean = 0;
        System.out.print("Enter the array : ");
        for(int i=0;i<l;i++)
        {
            arr[i] = sc.nextInt();
            mean += arr[i];
        }
        System.out.println("Mean of the elements is : "+((float)mean/arr.length));
        sc.close();
    }    
}
