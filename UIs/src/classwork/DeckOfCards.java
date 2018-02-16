package classwork;

import java.util.Random;

/**
 * Created by V Krasauskas /** /**Created on Feb 13, 2018
 **/

public class DeckOfCards {

	public static void main(String[] args) {

		// Generating the deck of cards
		char spades = '\u2660';
		char clubs = '\u2663';
		char hearts = '\u2665';
		char diamonds = '\u2666';
		String[] deck = new String[52];
		for (int i = 0; i < 52; i++) {
			switch (i % 13) {
			case 9:
				deck[i] = "Jack";
				break;
			case 10:
				deck[i] = "Queen";
				break;
			case 11:
				deck[i] = "King";
				break;
			case 12:
				deck[i] = "Ace";
				break;
			default:
				deck[i] = String.valueOf(i % 13 + 2);
				break;
			}
			switch (i % 3) {
			case 0:
				deck[i] += spades + " ";
				break;
			case 1:
				deck[i] += clubs + " ";
				break;
			case 2:
				deck[i] += hearts + " ";
				break;
			case 3:
				deck[i] += diamonds + " ";
				break;
			}

		}
		
		Random ran = new Random();
		for (int i = 0; i < 4; i++) {
			System.out.println("Random card No" + (i + 1) + " is " + deck[ran.nextInt(52)]);
		}
	}

}
