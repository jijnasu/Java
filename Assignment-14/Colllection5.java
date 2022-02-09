import java.util.*;  
public class Colllection5 
{  
 public static void main(String args[])
 {  
  TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();      
  treemap.put(1, "A");
  treemap.put(2, "B");
  treemap.put(3, "C");
  treemap.put(4, "C");
  treemap.put(5, "D");
  
  System.out.println("Elements of TreeMap content are: " + treemap);
  System.out.println("Keys which are between 2 and 4(inclusive): " + treemap.tailMap(2).headMap(4+1));
  }
}