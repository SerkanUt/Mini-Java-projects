package apdersd;

import java.util.Scanner;

// Try-Catch exercise

public class trycatch {
	public static void main(String[] args) {
		String n1;
		int n2;
		int a,t;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number:");
		n1 = scan.nextLine();
		try {
			a=Integer.parseInt(n1);
			
		}
		
		catch (Exception e) {
			System.out.println("Please enter a number: ");
			n1 = scan.nextLine();
		}
		
 finally {
	 System.out.print(false);
 }
	
	
}}
