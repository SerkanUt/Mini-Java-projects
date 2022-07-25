package apdersd;
import java.util.Scanner;
// prints the first n fibonacci numbers

public class fibonacci {
	public static void fib(int x) {
		 int st = 1;
		 int t = 0;
		 while(x>0) {
			 System.out.println(t);
			 t = t + st;
			 st = (t-st);
			 x--;
		 }
	}
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 int x = scan.nextInt();
	 fib(x);

	 
 }
}
