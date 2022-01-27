public class StringDays {
    static void swap(String w[],int i,int j)
    {
        String s=w[i];
        w[i] = w[j];
        w[j] = s;
    }
    public static void main(String[] args) {
        String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String words[]=days.split(" ");
        // System.out.println(words[0]);
        for(int i=0;i<words.length/2;i++)
            swap(words,i,words.length-1-i);
        
        for(int i=0;i<words.length;i++)
            System.out.print(words[i]+"  ");
    }
}
