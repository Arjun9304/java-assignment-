//2) Given the following class

//Employee class{ Double Age; Double Salary; String Name}
//Design the class in such a way that the default sorting should work on firstname and lastname.
//
//Also, Write a program to sort Employee objects based on salary using Comparator

package assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q2 {
	private String name;
	private double age;
	private double salary;

	public Q2(String name, double age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Q2 employee1 = new Q2("Mohit", 21, 100.0);
		Q2 employee2 = new Q2("Chhotu", 20, 80.0);
		Q2 employee3 = new Q2("Jai", 21, 90.0);
		Q2 employee4 = new Q2("Raj", 22, 120.0);
		Q2 employee5 = new Q2("Prateek", 23, 100.0);
		List<Q2> employeeList = new ArrayList<>();
		employeeList.add(employee1);

		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		Collections.sort(employeeList, new Comparator<Q2>() {
			public int compare(Q2 e1, Q2 e2) {
				if (e1.getSalary() > e2.getSalary()) {
					return 1;
				} else if (e1.getSalary() == e2.getSalary()) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		System.out.println("Employess in decreasing order of salary");
		Collections.reverse(employeeList);
		for (Q2 e : employeeList) {
			System.out.println(e.getName() + " " + e.getSalary());
		}
	}
}
