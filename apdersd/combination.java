package apdersd;
import java.util.Scanner;
// Combinations math

public class combination {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int nr = x - y;
		int carp = 1;
		int rcarp = 1;
		int tcarp = 1;
		int fin;
		
		while (nr>1) {
		tcarp = tcarp * nr;
		nr--;
	}
		
		while(x>1) {
			carp = carp * x;
			x--;
		}
		while(y>1) {
			rcarp = rcarp * y;
			y--;
		}

	fin = carp / (rcarp*tcarp);
	System.out.println(fin);

}
}
