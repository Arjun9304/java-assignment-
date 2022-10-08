//Use iterator stream method to generate a stream

package assignment5;

import java.util.stream.IntStream;

public class Q4 {
	 public static void main(String[] args) {
	        IntStream.iterate(0, i->i<10, i->i+1).forEach(System.out::println);
	    }

}
