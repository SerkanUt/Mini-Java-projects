package apdersd;

public class inertialarray {
	public static boolean isInertial(int[] dizi) {
		int a = 0;
		int b = 0;
		int c = dizi.length;
		int maxNum = dizi[0];
		int secNum = dizi[0];
		for(int i = 0; i<c; i++) {
			if(dizi[i] % 2 != 0) {
				a++;
			}
	        if (dizi[i] > maxNum) {
	             maxNum = dizi[i];
	        }
	}
		for(int i = 0; i<c; i++) {
	        if (dizi[i] > secNum && dizi[i] < maxNum && dizi[i] % 2 == 0) {
	             secNum = dizi[i];
	        }
		}
		for(int i = 0; i<c; i++) {
			if(dizi[i] > secNum && dizi[i] % 2 != 0) {
				b++;
			}
		}
		if(a != 0 && b == a && maxNum % 2 == 0) {
			return true;
			
		}
		else {
		return false;
		}
		}
	
	public static void main(String[] args) {
		int[] dizi = {2,12,12,4,6,8,11};
		boolean x = isInertial(dizi);
		System.out.println(x);
	}
	
}