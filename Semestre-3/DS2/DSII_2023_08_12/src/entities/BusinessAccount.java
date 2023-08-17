package entities;

public class BusinessAccount extends Account{
	private double loanLimit;

	/* Constructors */
	public BusinessAccount() {
	super();
	}

	public BusinessAccount(int number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	/* Getter and Setter */
	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	/* Methods asked on activity */
	public void withdraw(double amount) {
		super.setBalance(super.getBalance() - amount);
	}

	public void deposit(double amount) {
		super.setBalance(super.getBalance() + amount);
	}

	public void loan(double amount) {
		this.loanLimit -= amount;
	}
	    
	    @Override
	    public String toString(){
	        return 
	        "Business Account\n" +
	        "\nNumber: " + super.getNumber() +
	        "\nHolder: " + super.getHolder() +
	        "\nBalance: " +  super.getBalance() +
	        "\nLoan Limit: " +  this.loanLimit;
	    }

}
