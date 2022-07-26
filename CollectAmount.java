package com.lao.javaLearning;

public class CollectAmount {
	 public Integer collectedAmount=1000;
	 
	 public Integer collectAmountAndGiveItToMe() {
		 System.out.println("daddy have collected rupees"+collectedAmount);
		return collectedAmount;
	}

	public static void main(String[] args) {
		// Return Types
		CollectAmount mySon= new CollectAmount();
Integer	amount =mySon.collectAmountAndGiveItToMe();
System.out.println("Got the amount son     "      + amount);
		

	}

}
