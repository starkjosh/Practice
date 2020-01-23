package com.fun;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Let's play a game.");
		
		int n = -1;
		int r = -2;
		float wins = 0;
		float losses = 0;
		String resp = "y";
		Random rand = new Random();
		while(resp.contains("y")) {
			System.out.println("I'm thinking of a number between 1 and 9, can you guess it?");
			
			r = rand.nextInt(9) + 1;
			n = reader.nextInt(); 
			
			if(r == n) {
				System.out.println("You guessed it! You must have the touch.");
				System.out.println("Want to play again?");
				wins++;
				resp = reader.next();
			} else {
				System.out.println("Ooops, you guessed wrong! I was thinking of " + r);
				System.out.println("How about we try again?");
				losses++;
				resp = reader.next();
			}
		}
		System.out.println("Boo, you're no fun!");
		System.out.println("You won " + wins + "time(s).");
		System.out.println("You lost " + losses + "time(s)");
		System.out.println("Win percentage = " + wins/(wins+losses) + "%");
		if(wins/(wins+losses) > .5) {
			System.out.println("Hmm, not bad. Maybe you're not so dumb after all.");
		} else {
			System.out.println("Hahahaha, what an inferior being.");
		}

		reader.close();
	}

}
