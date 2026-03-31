import java.util.Scanner;

// Base class
class Account {
    protected int accountNumber;
    protected String name;
    protected double balance;

    // Constructor using 'this'
    Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid Amount!");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
    }

    // Display method
    public void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + this.accountNumber);
        System.out.println("Name      : " + this.name);
        System.out.println("Balance   : ₹" + this.balance);
    }
}

// Derived class (Inheritance example)
class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(int accNo, String name, double balance, double rate) {
        super(accNo, name, balance);
        this.interestRate = rate;
    }

    public void addInterest() {
        double interest = this.balance * this.interestRate / 100;
        this.balance += interest;
        System.out.println("Interest Added: ₹" + interest);
    }
}

// Main class
public class BankSystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> accounts = new ArrayList<>();

    // Create account
    public static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        accounts.add(new SavingsAccount(accNo, name, balance, 5));
        System.out.println("Account Created Successfully!");
    }

    // Find account
    public static Account findAccount(int accNo) {
        for (Account acc : accounts) {
            if (acc.accountNumber == accNo) {
                return acc;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n====== BANK SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display Account");
            System.out.println("5. Add Interest");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    Account acc1 = findAccount(accNo);

                    if (acc1 != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();
                        acc1.deposit(amt);
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    Account acc2 = findAccount(accNo);

                    if (acc2 != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();
                        acc2.withdraw(amt);
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    Account acc3 = findAccount(accNo);

                    if (acc3 != null) {
                        acc3.display();
                    } else {
                        System.out.println("Account Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    Account acc4 = findAccount(accNo);

                    if (acc4 instanceof SavingsAccount) {
                        ((SavingsAccount) acc4).addInterest();
                    } else {
                        System.out.println("Invalid Account Type!");
                    }
                    break;

                case 0:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);
    }
}
