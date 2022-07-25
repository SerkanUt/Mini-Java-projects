package apdersd;

// Finds every perfect number between 1 and 1000

public class mukemmelsayi {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		for (int i = 1; i < 1000; i++) {
			y = 0;
			x = 0;
			for (int j = 1; j < i; j++) {
				
				if (i % j == 0) {
					x = x + j;
				}

			
			}
			if (i == x) {
				System.out.println(i);
				
			
			}
		}
	}
}
