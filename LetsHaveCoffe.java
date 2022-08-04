package com.lao.conditional_statements;

public class LetsHaveCoffe {
//data type boolean - true ,false

	boolean isCupEmpty = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LetsHaveCoffe coffe = new LetsHaveCoffe();

		if (coffe.isCupEmpty) {
			System.out.println("Fill the Cup");
		} else {
			System.out.println("Drink the cofee");
		}
	}
}
