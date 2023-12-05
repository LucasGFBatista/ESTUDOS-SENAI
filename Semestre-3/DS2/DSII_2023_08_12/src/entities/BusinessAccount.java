package entities;

public class BusinessAccount extends Account {
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

	public void loan(double amount) {

		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

	    @Override
	    public String toString(){
	        return 
	        "\n\nBusiness Account" +
	        "\nNumber: " + super.getNumber() +
	        "\nHolder: " + super.getHolder() +
	        "\nBalance: " +  super.getBalance() +
	        "\nLoan Limit: " +  this.loanLimit;
	    }

}
