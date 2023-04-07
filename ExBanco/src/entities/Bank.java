package entities;

public class Bank {
    private final int account;
    private String name;
    private double amount;

    public Bank(int account){

        this.account = account;
    }
    public Bank(int account, String name, double amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public Bank(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public int getAccount() {
        return account;
    }


    public String getName() {
        return name;
    }



    public double getAmount() {
        return amount;
    }


    public double newDepositAmount(double amount){
       return this.amount = this.amount + amount;
    }

    public double newWithdraw(double amount){
        return this.amount = this.amount - amount - 5;
    }
}


