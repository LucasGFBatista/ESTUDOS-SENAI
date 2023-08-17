package entities;

public class SavingAccount extends Account {
	private double interestRate;

	/* Constructors */
	public SavingAccount() {
		super();
	}

	public SavingAccount(int number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	/* Getters and Setters */

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	/* Method asked */
	public void updateBalance() {
		balance += balance * interestRate;
	}

	@Override
	public String toString() {
		return "\n\nSavingAccount \nInterestRate: " + interestRate + 
				"\nBalance: " + balance ;
	}
	
	
	

}
