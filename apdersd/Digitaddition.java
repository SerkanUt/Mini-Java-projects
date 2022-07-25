package apdersd;
import java.util.Scanner;

// Adds up each digit of inputted number

public class Digitaddition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int t = 0;
		int sum = 0;
		while(a>0) {
		t = a % 10;
		sum = sum + t;
		a = a / 10;
		}
		System.out.println(sum);
		
		
		
	}

}
