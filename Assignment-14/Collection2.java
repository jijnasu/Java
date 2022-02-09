import java.util.*;
  public class Collection2 {
  public static void main(String[] args) {
   LinkedList<String> c1= new LinkedList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");

          LinkedList<String> c2= new LinkedList<String>();
          c2.add("Red");
          c2.add("Green");
          c2.add("Black");
          c2.add("Orange");
         LinkedList<String> c3= new LinkedList<String>();
         c3.add("Red");
         c3.add("Green");
         c3.add("Black");
         c3.add("Pink");
         c3.add("Black");
         c3.add("White");
      
         
          System.out.println(compare(c1,c2));         
          System.out.println(compare(c1,c3));         
     }


     static boolean compare(LinkedList<String> c1,LinkedList<String> c2)
     {
         boolean res = true;
         for (String e : c1)
         {
            res = (c2.contains(e) ? true : false);
            if(!res)
               break;
         }
         if(res)
            for (String e : c2)
            {
               res = (c1.contains(e) ? true : false);
               if(!res)
                  break;
            }
         return res;
     }
}