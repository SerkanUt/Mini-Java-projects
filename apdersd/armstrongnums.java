package apdersd;
// finds armstrong number between 100 and 1000
public class armstrongnums {
	public static void main(String[] args) {
		int x, y, z;
		double b, c, d;
		double a;
		for (int i = 100; i < 1000; i++) {
			
			x = i / 100;
			y = i / 10 - x * 10;
			z = i - (i/10) * 10;
			b = x; c = y; d = z;
			a = Math.pow(b, 3) + Math.pow(c, 3) + Math.pow(d, 3);
			if (a == i) {
				System.out.println(i);

				

			}

			
		}
	}
}
