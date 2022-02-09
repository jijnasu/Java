import java.util.*;
public class Collection6{
	public static void main(String args[]){
		Set<String> h1=new HashSet<String>();
		h1.add("Red");
		h1.add("Green");
		h1.add("Black");
		System.out.println( "first hashset is: " + h1);
		Set<String> h2=new HashSet<String>();
		h2.add("Blue");
		h2.add("Red");
		h2.add("Black");
		System.out.println( "second hashset is: " + h2);
		h1.retainAll(h2);
		Set<String> hashSetToTreeSet= new TreeSet<>(h1);
		System.out.println("tree set: " + hashSetToTreeSet);
	}
}