package apdersd;

public class matrix {
		public static void main(String[] args) {
			int[][] dizi = {{1,2,3},{1,2,3}};
			int[][] dizi2 = {{1,2,3},{1,2,3}};
			int[][] dizi3 = new int[2][3];
			for (int i=0; i<2; i++) {
				for (int j=0; j<3; j++) {
					dizi3[i][j] = dizi[i][j] + dizi2[i][j];
				    System.out.print(dizi3[i][j]+" ");
				}
				System.out.println(" ");
			}
		
			}
		}

	

