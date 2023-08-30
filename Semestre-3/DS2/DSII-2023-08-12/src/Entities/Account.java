package entities;

public abstract class Account{
    private int number;
    private String holder;
    private double balance;
    
    /*Constructos*/
    
    public Account(){}
    public Account (int number, String holder, double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
    
    /*Getters and Setters*/
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    
    public String getHolder(){
        return holder;
    }
    public void serHolder(String holder){
        this.holder = holder;
    }
    
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    /*Methods asked on activity*/
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    
    @Override
    public String toString(){
        return 
        "Business Account\n" +
        "\nNumber: " + String.format("%.2f", this.number) +
        "\nHolder: " + String.format("%.2f", this.holder) +
        "\nBalance: " + String.format("%.2f", this.balance);
    }
    
}
