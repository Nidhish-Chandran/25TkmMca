//2. Using ArithmeticException (with input) 

import java.util.Scanner;

class BankAccount2 {
    double balance;

    BankAccount2(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        try {
            if (amount > balance) {
                int x = 10 / 0; // Force ArithmeticException
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful!");
                System.out.println("Remaining Balance: " + balance);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Insufficient balance (Arithmetic Exception occurred)");
        }
    }
}

// Main Class
public class BankApp2  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        BankAccount2 account = new BankAccount2(balance);
        account.withdraw(amount);

        sc.close();
    }
}