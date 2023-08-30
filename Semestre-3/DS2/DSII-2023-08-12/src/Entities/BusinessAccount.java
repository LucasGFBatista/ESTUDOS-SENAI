package Entities;
public class BusinessAccount extends Account{
    private double loanLimit;
    
    /*Constructors*/
    public BusinessAccount(){}
    public BusinessAccount(int number, String holder, double balance, double loanLimit){
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
    
    
    /*Getter and Setter*/
    public int getLoanLimit(){
        return loanLimit;
    }
    public void setLoanLimit(int loanLimit){
        this.loanLimit = loanLimit;
    }
    
    
    /*Methods asked on activity*/
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void loan (double amount){
        this.loanLimit -= amount;
    }
    
    @Override
    public String toString(){
        return 
        "Business Account\n" +
        "\nNumber: " + String.format("%.2f", super.number) +
        "\nHolder: " + String.format("%.2f", super.holder) +
        "\nBalance: " + String.format("%.2f", super.balance) +
        "\nLoan Limit: " + String.format("%.2f", this.loanLimit);
    }

}