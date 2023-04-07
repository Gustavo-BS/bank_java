package application;


import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int account;
        int op1;
        String name;
        String op;
        double initial;
        double amount;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number:");
        account = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder:");
        name = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)?");
        op = sc.nextLine();



        Bank bank = new Bank(account);
        if(op.equals("y")){

            System.out.println("Enter initial deposit value: ");
            initial = sc.nextDouble();
            bank = new Bank(account, name, initial);
        } else if (op.equals("n")) {
            bank = new Bank(account, name);
        }


        System.out.println("Account data:");
        System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f\n",bank.getAccount(), bank.getName(), bank.getAmount() );


        do{
            System.out.println("Enter an option:");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("Any - to exit");
            op1= sc.nextInt();
            if (op1 == 1) {
                System.out.println("Enter the amount you wish to deposit, a fee of $5 will be charged:\n");
                amount = sc.nextDouble();
                bank.newDepositAmount(amount);
                System.out.println("Account data:");
                System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f\n",bank.getAccount(), bank.getName(), bank.getAmount() );
            } else if (op1 == 2) {
                System.out.println("Enter the amount you wish to withdraw:\n");
                amount = sc.nextDouble();
                bank.newWithdraw(amount);
                System.out.println("Account data:");
                System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f\n",bank.getAccount(), bank.getName(), bank.getAmount() );
            }

        }while (op1 == 1 || op1 == 2);



        sc.close();
    }
}