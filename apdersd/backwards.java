package apdersd;

// READS STRING BACKWORDS

public class backwards {
	public static void main(String[] args) {
		String x = "racecar";
		int a = x.length();
		char[] dizi = new char[a];
		for(int i = 0; i<a; i++){
			dizi[i] = x.charAt(i);
		}
		for (int j = a-1; j>-1; j--) {
			System.out.print(dizi[j]);
		}
		

	}
}
