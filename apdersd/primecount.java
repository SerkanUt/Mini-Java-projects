package apdersd;

// How many Prime numbers are between the given integers

public class primecount {
	public static int primeCount(int s, int e) {
		int t = 0;
		int a = 1;
		int en = e+1;
		for(int i = s; i < en; i++) {
			if(a == 0) {
				t++;
			}
			a = 0;
			for(int j = 2; j<i; j++) {
				if(i % j == 0) {
					a++;
				}
		}
		}
		return(t);
	}
	public static void main(String[] args) {
		int t = primeCount(11,30);
		System.out.println(t);
	}
}
