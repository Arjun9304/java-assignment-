package assignment3;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q3 {
	int age;
	String name;
	String designation;

	Q3(int age, String name, String designation) {
		this.age = age;
		this.name = name;
		this.designation = designation;
	}

	public String toString() {

		return "(age is->" + age + "," + "name is->" + name + "," + "desination is->" + designation + ")";
	}

	// public class FourthProgram {

	public static void main(String args[]) {
		Q3 e1 = new Q3(20, "Mohit", "trainee");
		Q3 e2 = new Q3(28, "Jai", "manager");
		Q3 e3 = new Q3(27, "Chotu", "director");
		Q3 e4 = new Q3(38, "Raj", "CEO");

		Map<Q3, Integer> map = new LinkedHashMap<>();

		map.put(e1, 150);
		map.put(e2, 2000);
		map.put(e3, 3882);
		map.put(e4, 1855232);
		for (Q3 key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
