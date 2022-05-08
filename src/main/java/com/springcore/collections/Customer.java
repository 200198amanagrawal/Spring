package com.springcore.collections;

public class Customer {
	private Bank bank;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Bank bank) {
		super();
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Customer [bank=" + bank + "]";
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
}
