package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
		balance = 0.0;
	}
	public Account() {
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	public void withdraw(double withdraw) {
		balance -= (withdraw + 5);
	}
	public String toString() {
		return "Account " + 
				number + 
				", Holder: " +
				holder +
				", Balance: $ " +
				balance;
	}
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}


}
