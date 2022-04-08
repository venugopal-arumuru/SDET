package com.java.abstractex;

public class SavingsAccount extends Account {
	private double minimumBalance;

	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withdraw(double amount) {
			if((balance-amount)>minimumBalance)
			{
				balance = balance-amount;
				return true;
			}
		return false;
	}

}
