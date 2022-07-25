package apdersd;

/* Counts how many words are in the sentence */
public class wordcount {
	public static void main(String[] args) {
	String x = "hello world, How are you";
	int y = x.length();
	int z = 0;
	for(int i = 0; i < y; i++) {
		if(x.charAt(i) == ' ') {
			z++;
		}
	}
	System.out.println(z+1);
}
}
