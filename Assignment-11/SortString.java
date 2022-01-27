public class SortString {

    static void swap(String w[],int i,int j)
    {
        String s=w[i];
        w[i] = w[j];
        w[j] = s;
    }

    static void sort(String s[])
    {
        for(int i=0;i<s.length;i++)
            for(int j=0;j<s.length-1-i;j++)
                if(s[j].compareTo(s[j+1])>0)
                    swap(s, j, j+1);
                    
    }
    public static void main(String[] args) {
        
        String arr[]="Ram John Harish Anand Ajay".split(" ");
        
        System.out.println("The array is :");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+",  ");
        
        sort(arr);
        System.out.println("\nAfter Sorting : ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+",  ");
            
    }
}
