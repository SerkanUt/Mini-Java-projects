package apdersd;

import java.util.Scanner;

public class tpuan {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("What is the score");
		double c = scan.nextDouble();
		double t;
		t = (c - 50) / 10;
		System.out.println(t);
	}
}

