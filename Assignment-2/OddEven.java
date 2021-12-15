import java.util.*;
class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = sc.nextInt();
        int arr[]=new int[l],odd = 0, even = 0;
        System.out.print("Enter the array : ");
        for(int i=0;i<l;i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)
                even += 1;
            else
                odd += 1;
        }
        System.out.println("No. of odd elements: "+odd);
        System.out.println("No. of even elements: "+even);
        sc.close();
    }    
}
