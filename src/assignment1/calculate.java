package assignment1;

import java.util.Scanner;

public class calculate  {
	public static void main(String[] args) 
	   {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("MENU:");
	      System.out.println("1.Area of circle");
	      System.out.println("2.Circumference of circle");
	      System.out.println("Please enter any of the above option: ");
	      int choice = sc.nextInt();
	      switch(choice)
	      {
	         case 1: System.out.println("Please enter radius of circle: ");
	         double radius = sc.nextFloat();
	         double areaCircle = Math.PI*radius*radius;
	         System.out.println("Area of circle is: " + areaCircle);
	         break;
	         
	         case 2: System.out.println("Please enter base and height of triangle: ");
	         int r;
	         double circumference;
	         System.out.println("Enter the radius of the circle ::");
	         r = sc.nextInt();
	         circumference = Math.PI*2*r;
	         System.out.println("Circumference of the circle is ::"+circumference);
	         break;
	         
	         default:System.exit(0);
	      }
	      sc.close();
	   }
	}