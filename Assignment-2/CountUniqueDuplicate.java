import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
// import java.util.*;

class CountUniqueDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int l = sc.nextInt();
        int arr[]=new int[l], unique = 0, duplicate = 0;
        Map<Integer, Integer> dict = new HashMap<>();
        System.out.print("Enter the array : ");
        for(int i=0;i<l;i++)
        {
            arr[i] = sc.nextInt();
            if(dict.get(arr[i])==null)
                dict.put(arr[i],1);
            else
                dict.put(arr[i],dict.get(arr[i])+1);
                // dict
            // System.out.print(arr[i]+" : "+dict.get(arr[i])+", "+ dict.En);
        }

        for(Map.Entry<Integer,Integer> item : dict.entrySet())
            if(item.getValue()==1)
                unique += 1;
            else
                duplicate += item.getValue();
        System.out.println("So, #UNIQUE = "+unique+" and #DUPLICATE = "+duplicate);
        sc.close();
    }
}
