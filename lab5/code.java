import java.util.Scanner;

// Base class Account
class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String name, int accNum, String accType, double initialBalance) {
        customerName = name;
        accountNumber = accNum;
        accountType = accType;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        }
    }

    void computeInterest() {
        // Empty method, to be overridden in subclass SavAcct
    }

    void showDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        displayBalance();
    }
}

// Subclass Savings Account
class SavAcct extends Account {
    double interestRate;

    SavAcct(String name, int accNum, String accType, double initialBalance, double rate) {
        super(name, accNum, accType, initialBalance);
        interestRate = rate;
    }

    @Override
    void computeInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest computed and deposited: $" + interest);
    }
}

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a savings account
        SavAcct savings = new SavAcct("John Doe", 123456, "Savings", 1000, 5);

        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute Interest");
            System.out.println("4. Show Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    savings.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    savings.withdraw(withdrawAmount);
                    break;
                case 3:
                    savings.computeInterest();
                    break;
                case 4:
                    savings.showDetails();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        scanner.close();
    }
}

