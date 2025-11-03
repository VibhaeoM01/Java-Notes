// package OOP;
class InsufficientBalanceException extends Exception {  //User Defined Exception
    public InsufficientBalanceException(String message) {
        super(message);   // what is super
    }
}

public class BankAcc {
    private double balance;

    // Constructor
    public BankAcc(double initialBalance) {
        this.balance = initialBalance;   // will this keyword act is +=?
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method with exception handling
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }


// Main class to test
    public static void main(String[] args) {
        BankAcc account = new BankAcc(1000);

        account.checkBalance();
        account.deposit(500);
        account.checkBalance();

        try {
            account.withdraw(2000);  // This will throw exception
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(700);  // Valid withdrawal
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        account.checkBalance();
    }
}