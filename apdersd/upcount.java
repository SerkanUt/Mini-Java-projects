package apdersd;

/* Adds every int in the array in order. 
 * Each iteration checks if the previous one was smaller than n 
 * and if this one is bigger or equals to n. 
 * If so, adds to the counter*/
public class upcount {
		public static int nUpCount(int n) {
			int dizi[] = {2,3,1,-6,8,-3,-1,2};
			int a = 0;
			int b;
			int t = 0; 
			for (int i = 0; i<8; i++) {
				b = a;
				a = dizi[i] + a;
				if(b < n && a >= n) {
					t++;
				}
			}
			return(t);
			}
		
		public static void main(String[] args) {
			int t;
			t = nUpCount(5);
			System.out.println(t);
		}
}
