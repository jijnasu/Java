import java.util.*;
class Linearsearch 
{
    public static void main(String[] args) {
        System.out.print("Enter the length of array: ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(),arr[] = new int[l],i=0;
        System.out.print("Enter an array: ");
        for(i=0;i<l;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the element: ");
        int x = sc.nextInt();
        for(i=0;i<l;i++)
            if(arr[i]==x)
                break;
        if(i<l)
            System.out.println("Element found at index : "+i);
        else
            System.out.println("Element not found...");
        sc.close();
    }
}
