package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter account Data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        Double balance = sc.nextDouble();
        System.out.print("WithdrawLimit: ");
        Double withdrawlimit = sc.nextDouble();

        Account acc = new Account(number,holder,balance,withdrawlimit);

        System.out.print("Enter withdraw amount: ");
        Double amount = sc.nextDouble();

        String error = acc.validateWithdraw(amount);

        if (error == null) {
                acc.withdraw(amount);
                System.out.printf("New balance: %.2f", acc.getBalance());
            } else {
                System.out.println(error);

            }
        sc.close();
    }
}
