/* 
1. Write a Java application to simulate a Bank Account system.
The program should allow withdrawal from an account. If the withdrawal amount is greater than the available balance, 
the program should throw a user-defined exception called InsufficientBalanceException and display an appropriate message. 
Otherwise, complete the withdrawal and display the remaining balance. ( Alsodemonstrate same using Arithmetic Exception)
*/

import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Cannot withdraw.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}

// Main Class
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        BankAccount account = new BankAccount(balance);

        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}