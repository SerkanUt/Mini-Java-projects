package apdersd;

// Finds every palindrome number between 100 and 5000

public class Palindromenums {
	public static void main(String[] args) {
		int x, y, z, a;
		for (int i = 100; i < 1000; i++) {
			x = i / 100;
			y = i - ((i / 10) * 10);
			
			if(x == y) {
			System.out.println(i);
			}
			}
		for (int i = 1000; i < 5000; i++) {
			x = i / 1000;
			y = (i / 100) - (10 * x);
			z = (i / 10) - ((i / 100) * 10);
			a = i - ((i / 10) * 10);
			if (x == a && y == z) {
				System.out.println(i);
			}
			
		}
		}

}
