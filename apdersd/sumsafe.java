package apdersd;

// Checks if adding up each int in the array = 0 or not */
public class sumsafe {
	public static int isSumSafe(int[] a) {
		int count = 0;
		int x = 0;
		for(int i = 0; i<a.length; i++) {
			count = count + a[i];
		}
		for(int i = 0; i<a.length; i++) {
			if(a[i]==count) x++;
			
		}
		if(x!=0) return 0;
		else return 1;
	}
	public static void main(String[] args) {
		int[] a = {5,-5, 1};
		System.out.println(isSumSafe(a));
	}

}
