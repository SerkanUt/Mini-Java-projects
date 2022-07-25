package apdersd;

// Matrix multiplication 

public class Matrixmult {
	public static void main(String[] args) {
		int[][] dizi1 = {{1,2,3},{2,3,4}};
		int[][] dizi2 = {{2,3,4},{3,1,2},{3,4,5}};
		int[][] dizi3 = {{0,0,0},{0,0,0}};

		for (int i = 0; i<2; i++) {
			for (int j=0; j<3; j++) {
				for (int k=0; k<3; k++) {
				dizi3[i][j] = dizi3[i][j] + dizi1[i][k] * dizi2[k][j];
			 
			    }
				   System.out.print(dizi3[i][j]+" ");	
		}
			System.out.println(" "); 
}}}
