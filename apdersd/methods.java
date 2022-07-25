package apdersd;

import java.util.ArrayList;
import java.util.List;

// Java methods

public class methods {
public static void main (String[] args) {
	String a = "hello world string test";
	int x = 123456;
	double y = 12.34;
	List<Integer> list = new ArrayList<Integer>();
	list.add(4);
	list.add(3);
	list.add(2);
	
	System.out.println(a.substring(3,10));
	System.out.println(a.indexOf("o"));
	System.out.println(a.equals("hello world string test"));
	System.out.println(a.compareTo("hello world string test more chars"));
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Math.abs(x));
	System.out.println(Math.pow(25, 2));
	System.out.println(Math.sqrt(625));
	System.out.println(Math.random());
	System.out.println(list.size());
}
}
