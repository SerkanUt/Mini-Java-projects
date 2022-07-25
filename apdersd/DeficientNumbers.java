package apdersd;

// Finds deficient numbers between 1 and 1000

public class DeficientNumbers {
	public static void main(String[] args) {
		int x = 0;
		for (int i = 1; i < 1000; i++) {
			x = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					x = x + j;
				}

			}
			if (x < 2*i) {
				System.out.println(i);

			}
		}
	}

}
