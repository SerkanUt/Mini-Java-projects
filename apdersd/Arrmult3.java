
// input 5 ints. Each one gets multiplied by 3.
package apdersd;
import java.util.Scanner;

public class Arrmult3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] dizi = new int[5];
		for (int i=0; i<5; i++) {
			dizi[i] = scan.nextInt();
			
		}
		for (int j = 0; j<5; j++) {
		System.out.println(dizi[j]*3);
				
		}
	}}
