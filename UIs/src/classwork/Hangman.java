package classwork;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by V Krasauskas /** /**Created on Feb 13, 2018
 **/

public class Hangman {
	
	public static int numGuesses(int a) {
		return ++a;
	}

	public static void guess(char[] word, boolean[] guessed, int guesses) {
		Scanner in2 = new Scanner(System.in);
		if (checkWord(guessed)) {
			System.out.println("You have guessed the word " + String.valueOf(word) + " in " + guesses + " guesses!");
			} else {
			System.out.print("Guess letter for word ");
			displayWord(word, guessed);
			char letter = in2.nextLine().toUpperCase().charAt(0);
			guesses = numGuesses(guesses);
			checkLetter(letter, word, guessed, guesses);
		}
	}

	public static void displayWord(char[] word, boolean[] guessed) {
		for (int i = 0; i < word.length; i++) {
			if (guessed[i] == true) {
				System.out.print(word[i]);
			} else {
				System.out.print("*");
			}
		}
		System.out.print(" ");
	}

	public static void checkLetter(char letter, char[] word, boolean[] guessed, int guesses) {
		for (int i = 0; i < word.length; i++) {
			if (word[i] == letter) {
				guessed[i] = true;
			}
		}
		guess(word, guessed, guesses);
	}

	public static boolean checkWord(boolean[] guessed) {
		boolean status = true;
		for (int i = 0; i < guessed.length; i++) {
			if (guessed[i] == false) {
				status = false;
			}
		}
		return status;
	}

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner in = new Scanner(System.in);
		String[] words = { "SMITH", "WORD", "THIS", "THAT", "HANGMAN", "TABLE", "DESK", "MORON", "ROSEMARY" };

		int guesses = 0;
		char play = 'y';
		while (play == 'y') {
			char[] word = words[ran.nextInt(8)].toCharArray();
			boolean[] guessed = new boolean[word.length];
			for (int i = 0; i < guessed.length; i++) {
				guessed[i] = false;
			}
			guess(word, guessed, guesses);
			System.out.print("Would you like to play again? (y/n) ");
			play = in.nextLine().charAt(0);
		}
		System.out.println("Exiting!");
		in.close();

	}

}
