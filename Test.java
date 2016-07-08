 import java.util.Random; 
 import java.util.Arrays;
	class Card {
	
	static String[] pip = new String[]        {"ACE","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","JOKER"};
	static String[] suite = new String[] {"club", "DIAMOND","HEART","SPADE",""};
	
	public static int getSuite(int s) {
	return s / 13;
	}
	public static int getPip(int s) {
		if (s / 13 == 4) {
		return 13;
	} else {
		return s % 13;	
		}
	}
	public static String display(int s) {
	int i = s / 13;
	String suit = suite[i];
	String p = pip [s % 13];
	if (i == 4) {
		p = pip[13];
	}
	String card = p + " " +suit;
	return card;
	}
	public static int[] generateRandomCards() {
		int[] randomcards = new int[13];
		for (int i = 0; i < 13; i++) {
		randomcards[i] = (1+ (int) (Math.random() * 53));
		System.out.println(display(randomcards[i]));
		}
		return randomcards;
		

	}
	/*
	public static int[] Split(int[] randomcards) { 
		int j = 0;
		int[] split= new int[13];
		for (int i = 0; i < 13 ; i++) {
		if (randomcards[i] % 4 == j) {		
		//split[i] = randomcards[i];
		}
		j++;
		//checkLife(split);
	}*/
	public static void checkFirstLife() { 
		int[] randomcards = generateRandomCards();
		
		Arrays.sort(randomcards);
		System.out.println("sorted cards :");
		
		for (int i = 0;i < 13; i++) {
			System.out.println(display(randomcards[i]));
		}
		for (int i =0; i < 11; i++)
			if (randomcards[i] + 1 == randomcards[i + 1] && randomcards[i+1] + 1 == randomcards[i+2])
				System.out.println("natural life"+display(randomcards[i]));		


}

	
}

public class Test {
	public static void main (String args[]) {
		Card c = new Card ();
		c.checkFirstLife();
	}
}
