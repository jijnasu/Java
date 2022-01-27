public class RemoveMultiSpaces {
    
    public static void main(String[] args) {
        String str = "  String     With    Multiple Spaces ";
        System.out.println("Given String: "+str);
        
        System.out.print("Result : "+str.replaceAll("\\s+", " ").trim());
        
    }
}
