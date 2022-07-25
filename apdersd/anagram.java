package apdersd;

// returns 1 if 2 arrays contain anagrams, 0 if they don't.
public class anagram {
	public static int areAnagrams(char[] a1, char[] a2) {
		int x = a1.length;
		int y = a2.length;
		int counter = 0;
		if(x==y) {
			for(int i = 0; i<x; i++) {
				for(int j = 0; j<x; j++) {
					if(a1[i]==a2[j]) {
						counter++;
						a2[j] = '\0';
						break;
					}
				}
			}
			if(counter == x) return 1;
			else return 0;
		}
		else {
			return 0;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		char[] a1 = {'a','n','g', 'e', 'l'};
		char[] a2 = {'g','l','e', 'a', 'n'};
		int b = areAnagrams(a1,a2);
		System.out.println(b);

		

	}
}
