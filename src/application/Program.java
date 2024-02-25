package application;

import entites.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;


        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Enter the holder");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is There initiaç deposit (y/n)");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.println("Enter the initial value");
            double firstDeposit = sc.nextDouble();
            account = new Account(number, holder, firstDeposit);
        }else{
            account = new Account(number,holder);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data");
        System.out.println(account);
        System.out.println();


        System.out.print("Enter a Withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Update account data");
        System.out.println(account);


        sc.close();


    }
}