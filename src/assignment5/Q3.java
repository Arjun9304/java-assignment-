//Use rangeClosed to create a  Stream

package assignment5;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q3 {
	public static void main(String[] args) {
		System.out.println(IntStream.rangeClosed(0, 50).boxed().collect(Collectors.toList()));
	}

}
