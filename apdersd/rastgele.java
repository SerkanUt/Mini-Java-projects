package apdersd;

import java.util.Scanner;
// Checks if the entered numbers add up to 1

public class rastgele {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers: ");
		double a = scan.nextDouble();
		double x = 0;
		for (double i = 1; i <= a; i++) {
			System.out.println("Enter a number: ");
			double b = scan.nextDouble();
			x = x + b;

			}
		if(x == 1) {
			System.out.println("ok");
		}
		else {
			System.out.println("no");
			
		}
	}

}
