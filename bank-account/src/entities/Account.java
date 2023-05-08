package entities;

public class Account {
	
	private int number;
	private String name;
	private char caracter;
	private double balance;
	private double deposit;
	
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

	public char getCaracter() {
		return caracter;
	}

	public double getBalance() {
		return balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public void addValue(double deposit) {
		this.balance += deposit;
	}
	
	public void removeValue(double withdraw) {
		this.balance -= withdraw + 5;
	}
	
	public String toString() {
		return "Account: " + number + ", Holder: " + name + ", $ " + String.format("%.2f", balance);
	}
	
}
