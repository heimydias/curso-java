package entities;

public class Account {
	
	private int number;
	private String name;
	private double balance;
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void addValue(double deposit) {
		this.balance += deposit;
	}
	
	public void removeValue(double withdraw) {
		this.balance -= withdraw + 5;
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance $ " + String.format("%.2f", balance);
	}
	
}
