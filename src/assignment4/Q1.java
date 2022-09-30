package assignment4;

public class Q1 {
	  public static void main(String[] args) {

	        concatenation c = (String a, String b) -> a + b;
	        System.out.println(c.concat("hello", "world"));
	        greater g = (int a, int b) -> {
	            if (a > b)
	                return true;
	            else
	                return false;
	        };
	        System.out.println(g.max(5, 6));
	        increment i = (int a) -> ++a;
	        System.out.println(i.inc(5));
	        convertupper u = (String a) -> a.toUpperCase();
	        System.out.println(u.convert("hello"));

	    }
	}

	interface concatenation {
	    String concat(String a, String b);

	}

	interface greater {
	    boolean max(int a, int b);
	}

	interface increment {
	    int inc(int a);
	}

	interface convertupper {
	    String convert(String a);
	}


