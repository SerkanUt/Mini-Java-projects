package apdersd;

// Checks if it is a Madhav array

public class madhavarray {
	public static int isMadhavArray(int[] dizi) {
		int diziuz = dizi.length;
		int gdiziuz = 0;
		int ilkd = 0;
		int sond = 0;
		int toplam = 0;
		int gtop = 0;
		int n = 1;
		int isMadhavArray = 0;
		
		while(gdiziuz <= diziuz) {
		for(int i = ilkd; i<=sond; i++) {
			toplam += dizi[i];
		}
		if(gtop == toplam || ilkd == sond){
			gtop = dizi[0];
			toplam = 0;
			isMadhavArray = 1;
		}
		else {
			isMadhavArray = 0;
			break;
		}
		
		ilkd = sond + 1;
		sond = ilkd + n;
		n++;
		gdiziuz = sond;	
	
}
		return isMadhavArray;
	}
	public static void main(String[] args) {
	int dizi[] = {2,1,1,4,-1,-1,5};
	System.out.println(isMadhavArray(dizi));
}}
