package entites;

public class Account {

    private int number;
    private String holder;
    private double balance;


    public Account(int number, String holder) {

        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double firstAccount) {
        this.number = number;
        this.holder = holder;
        deposit(firstAccount);
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(int number) {
        this.number = number;
    }

    public void deposit(double amount){

        balance += amount;
    }

    public void withdraw(double amount){
        balance += amount + 5.0;
    }

    public String toString(){

        return "Account"
                +number
                + ",Holder"
                +holder
                + ", Balance $"
                + String.format("%.2f", balance);
    }
}

