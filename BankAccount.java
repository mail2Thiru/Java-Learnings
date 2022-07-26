package com.lao.javaLearning;

public class BankAccount {
	long accountNumber = 123456789;
	String holderName = "Thiru";
	Integer accountBalance = 1002;

	public void getBalance() {
		System.out.println("AccountNumber is " + accountNumber + "Account holderName is" + holderName + "Balance is "
				+ accountBalance);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		account.getBalance();

	}

}