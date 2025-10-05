package practice_zero;

public class BankAccount {

    String owner;
    double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner(){
        return this.owner;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void printBalance(){
        System.out.println(balance);
    }
}
