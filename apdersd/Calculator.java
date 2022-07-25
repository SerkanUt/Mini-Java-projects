package apdersd;

import java.util.Scanner;

// Calculator
public class Calculator {
	
public static void toplam(int x, int y) {
	System.out.println(x+y);
}

public static void mult(int x, int y) {
	System.out.println(x*y);
}

public static void minus(int x, int y) {
	System.out.println(x-y);
}

public static void divide(int x, int y) {
	System.out.println(x/y);
}
	
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Addition, Subtraction, Multiplication or Division");
	String isl = scan.nextLine();
	System.out.println("Enter the numbers");
	int a = scan.nextInt();
	int b = scan.nextInt();

	if(isl.equals("Addition")) {
		toplam(a,b);
	}
	else if(isl.equals("Multiplication")) {
		mult(a,b);
	}
	else if(isl.equals("Subtraction")) {
		minus(a,b);
	}
	else if(isl.equals("Division")) {
		divide(a,b);
	}
	else {
		System.out.println("Please Enter One of Them");
	}

	
}

}
