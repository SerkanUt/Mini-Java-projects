package apdersd;
import java.lang.Math;

public class polynomials {
	public static double eval(double x, int[] a) {
		double counter = 0;
		for(int i = a.length-1; i>=0; i--) {
			double y = Math.pow(x, i);
			counter = counter + (a[i]*y);
		}
		return counter;
	}
	
	public static void main(String[] args) {
	double x = 3;
	int[] a = {3,2,1};
	System.out.println(eval(x,a));
	}
}
