package com.lao.conditional_statements;

public class SuperHeroOrNot {
	String hero ="Bat Man";

	public void heroOrNot() {
		switch (hero) {
		case "Iron Man":
			System.out.println("Iron Man is a Super Hero");
			break;
		case "Super Man":
			System.out.println("Super Man is a Super Hero");
			break;
		case "Bat Man":
			System.out.println("Bat Man is a Super Hero");
			break;

		default:
			System.out.println(hero + "Sorry I Dont Know");
		}

	}

	public static void main(String[] args) {
		SuperHeroOrNot heroOrNot = new SuperHeroOrNot();
		heroOrNot.heroOrNot();
	}

}
