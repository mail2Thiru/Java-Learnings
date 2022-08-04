package com.lao.conditional_statements;

public class WhosTheHero {
	String myHeroName = "Bat Man";

	public void superHeroGuesser() {

		if (myHeroName.equals("Iron Man")) {
			System.out.println("You Thought About Iron Man");
		} else if (myHeroName.equals("Bat Man")) {
			System.out.println("You Thought About Bat Man");
		} else if (myHeroName.equals("Thor")) {
			System.out.println("You Thought About Thor");

		} else {
			System.out.println("Sorry I cannot Guess");
		}

	}

	public static void main(String[] args) {
		WhosTheHero hero = new WhosTheHero();
		hero.superHeroGuesser();
	}
}