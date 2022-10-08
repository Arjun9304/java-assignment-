package assignment5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q9 {
	public static void main(String[] args) {
		List<Integer> integerList = Stream.of(1, 2, 3, 4, 5).filter(e -> e < 5)
				.collect(Collectors.toUnmodifiableList());

		System.out.println(integerList);
//	        integerList.add(6);
	}
}
