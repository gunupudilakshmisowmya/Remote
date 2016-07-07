 import java.util.Random;
	class Card {
	static int seq;
	static String[] pip = new String[] {"ACE","1","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
	static String[] suite = new String[] {"club", "DIAMOND","HEART","SPADE"};
	public Card( int seq) {
	this.seq = seq;
	}
	public static String getSuite(int s) {
	return suite[s / 13];
	}
	public static String getPip(int s) {
		return pip[s % 13];	
	}
	public static String display(int s) {
	int i = seq / 13;
	String suit = suite[i];
	String p = pip [seq % 13];
	String card = p + " " +suit;
	return card;
	}
	public static void generateRandomCards() {
		int[] randomcards = new int[13];
		for (int i = 0; i < 13; i++) {
		randomcards[i] = 1+(int)(Math.random()*52);
		System.out.println(display(randomcards[i]));
		}
	
		

	}
	
}

public class Test {
	public static void main (String args[]) {
		Card c = new Card (Integer.parseInt(args[0]));
		System.out.println(" " + c.getSuite(11));
		System.out.println(" " + c.getPip(11));
		System.out.println(" " + c.display(11));
		c.generateRandomCards();
	}
}
