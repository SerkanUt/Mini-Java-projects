package apdersd;
// Finds the next perfect square

public class funcquest1 {
	public static int isPerfectSquare(int n) {
		double a;
		for(int i = 1; i>0; i++) {
			n=n+1;
			a = Math.sqrt(n);
			if(a % 1 == 0){
				break;
			}
			else {
				continue;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int x;
		x=isPerfectSquare(6);
		System.out.println(x);
	}
}
