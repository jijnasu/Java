import java.io.*;
import java.util.*;
class DemoArrayList {

	public static void main(String[] args) {

		try {

			ArrayList<Integer> list = new ArrayList<>();

			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);

			System.out.println(list);
			list.set(2, 200);

			System.out.println(list);

		}

		catch (Exception e) {

		System.out.println(e);
		}
	}
}
