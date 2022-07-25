package apdersd;
import java.util.Scanner;
/* It will keep asking for inputs and 
 * adding them up until -1 is entered */
public class InfiniteAddition {
	public static void main(String[] args) {
		int x= 0;
		Scanner scan = new Scanner(System.in);
		for(int i=1; i>0; i++) {
			int a = scan.nextInt();
			if(a == -1) {
				break;
				
			}
			else {
				x = x + a;
			}
		
			
		}
		System.out.println(x);
		
	}
}
