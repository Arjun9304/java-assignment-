//1) Write Java code to define List . Insert 5 floating point numbers in List,
// and using an iterator,
//find the sum of the numbers in List.


package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class q1 {
	public static void main(String[] args) {

		List<Float> list = new ArrayList<>();

		list.add((float) 1.1);
		list.add((float) 1.2);
		list.add((float) 1.3);
		list.add((float) 1.4);
		list.add((float) 1.5);
		float sum = 0;
		Iterator<Float> it = list.iterator();
		while (it.hasNext()) {
			sum = sum + it.next();
		}
		System.out.println(sum);
	}
}
