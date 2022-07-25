package apdersd;

// Finds the next Porcupine number

public class porcupinenum {
	public static int findPorc(int p) {
	int t = 0;
	int a = 0;
	int y = 0;
	int c = 0;
		while(p>-1) {
			p++;

			for(int j = 2; j<p; j++) {
				if(p % j == 0) {
					a++;
				}
			}
			if(a == 0) {
				t = p - (p / 10 * 10);
				if (t==9) {
					c = p;
					while(c>-1) {
						c++;

						for(int j = 2; j<p; j++) {
							if(c % j == 0) {
								a++;
							}
						}
						if(a == 0) {
							t = c - (c / 10 * 10);
							if (t==9) {
								y = p;
								break;
							}
							else {
								break;
							}

						}
						a = 0;}
					
					if(y == p) {
						break;
					}
				}
				else {
					t = 0;
					y = 0;
				}

			}
			a = 0;
		
		}
		return y;
}
	public static void main(String[] args) {

		int x = findPorc(139);
		System.out.println(x);
	}
}
