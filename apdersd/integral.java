package apdersd;
import java.util.Scanner;

// Integrals

public class integral {
	public static void main(String[] args)
	{

	Scanner scan = new Scanner(System.in);
	System.out.println("Bottom value");
	double a = scan.nextDouble();
	System.out.println("Top value");
	double b = scan.nextDouble();
	System.out.println("exponential");
	double x = scan.nextDouble();
	System.out.println("coefficient");
	double y = scan.nextDouble();
	double z, c;
	
	z = y * (Math.pow(a, (x+1))) / (x+1);
	
	
	c = y * (Math.pow(b, (x+1))) / (x+1);

	if(c - z == 1) {
		System.out.println("ok");
	}
	else {
		System.out.println("no");
	}
	
	}
}
