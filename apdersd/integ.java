package apdersd;

import java.util.Scanner;

// Checks if the score is lower or higher than the class average.

public class integ {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("How many people are in the class: ");
		double a = scan.nextDouble();
		double x = 0;
		for (double i = 1; i <= a; i++) {
			System.out.println("Exam Score: ");
			double b = scan.nextDouble();
			 x = x +b;
			 }
		x = x / a;
		if(x>50) {
			System.out.println("To the left");
		}
		else if(x<50) {
			System.out.println("To the right");
		}
		else {
			System.out.println("in the middle");
		}

	}

}
