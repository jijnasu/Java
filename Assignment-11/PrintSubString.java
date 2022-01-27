public class PrintSubString {

    public static void main(String[] args) {
        String s = "shore";
        for(int i=0;i<s.length();i++)
            for(int j=i;j<s.length();j++)
            {
                for(int k=i;k<j+1;k++)
                    System.out.print(s.charAt(k));
                System.out.println();
            }
                    
    }
}
