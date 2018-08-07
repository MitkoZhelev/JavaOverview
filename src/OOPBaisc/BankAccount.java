package OOPBaisc;

public class BankAccount {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        this.balance += amount;
    }
    public void withdraw (double amount)
    {
        this.balance -= amount;
    }


    public int id;
    public double balance;
}
