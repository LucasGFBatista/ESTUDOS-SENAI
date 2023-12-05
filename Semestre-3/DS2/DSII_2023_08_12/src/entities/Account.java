package entities;

public class Account {
	private int number;
	private String holder;
	protected double balance;

	/* Constructos */

	public Account() {
	}

	public Account(int number, String holder, double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	/* Getters and Setters */
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
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


	/* Methods asked on activity */
	public void withdraw(double amount) {
		this.balance -= amount;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	@Override
    public String toString(){
        return 
        "\n\nAccount" +
        "\nNumber: " +  this.number +
        "\nHolder: " +  this.holder +
        "\nBalance: " + this.balance;
	}

}
