package apdersd;

// Adds up the first 100 numbers

public class Add100 {
	public static int toplam(int x, int y){
		y = y+x;

	return y;
	}

	public static void main(String[] args) {
		int i = 1, t = 0;
		while(i<101) {
			t=toplam(i, t);
			i++;
		}
	System.out.println(t);
}
}