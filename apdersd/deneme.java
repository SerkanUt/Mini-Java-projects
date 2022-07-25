package apdersd;

import java.util.ArrayList;

public class deneme {
	public static boolean denemefonk(int a) {
		for(int i = 0; i<5; i++) {
			if(a+i == 5) return true;
		}
		return false;
		
	}
	
	public static String[] strArrMethod(String[] arr) {
	String[] result = new String[arr.length]; 
	for (int j = 0; j < arr.length; j++) {
		String sm = arr[j]; 
		for (int k = j + 1; k < arr.length; k++) {
			if (arr[k].length() < sm.length()) {
				sm = arr[k]; 
			}
		}
		result[j] = sm;
	}
	
	return result;
	}
	
	public static void main(String[] args) {
		int l = 3;
		System.out.println(denemefonk(l));
		int i = 100;
		int o = 70;
		int p = 7%4+3;
		double hours = Math.abs(i - o) / 60.0;
		System.out.println((double) (2 / 4) + 3);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(3);
		numList.add(2);
		numList.add(1);
		numList.add(1, 0);
		System.out.println(numList);
		String a = "sing the song";
		String b = "ng";
		int x = a.indexOf(b);
		while(x >= 0) {
			a = a.substring(0,x) + a.substring(x + b.length());
			x = a.indexOf(b);
		}
		System.out.println(a);
		int[] arr = {-1,3,4,5,-2};
		int counter = 0;
		for (int j: arr) {
			if (j < 0) counter++;
		}
		System.out.println(counter);
		String t = "";
		System.out.println(t.length());
		String[] testOne = {"first", "day", "of", "spring"};
		String[] resultOne = strArrMethod(testOne);
		for (String h: resultOne) {
			System.out.println(h);
		}
		double m = (double)5/6;
		System.out.println(m);
	}
}
