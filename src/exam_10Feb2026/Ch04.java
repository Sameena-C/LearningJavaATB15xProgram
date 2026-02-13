package exam_10Feb2026;
/*
Bank Account Encapsulation
Create a BankAccount class with private balance field.
Implement deposit(), withdraw(), and getBalance() methods with proper validation.

Input: Initial balance: 1000, deposit: 500, withdraw: 200
Output: Balance after deposit: 1500.0 Balance after withdrawal: 1300.0

 Explanation:Implement proper encapsulation with validation to prevent invalid operations
 like negative deposits or insufficient balance withdrawals.
 */
public class Ch04 {
    public static void main(String[] args) {
      BankAccount user1 = new BankAccount(1000.0);
        user1.deposit(500.0);
        user1.withdraw(200.0);
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double init_balance) {
        if (init_balance < 0) {
            System.out.println("Error");
            this.balance = 0;
        } else {
            this.balance = init_balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance, boolean isCashier) {
        if(isCashier){
            this.balance = balance;
        }
        else {
            System.out.println("Not allowed to modify the balance");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return;
        }
        balance=balance+amount;
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient balance. Current balance: " + balance);
            return;
        }
        balance= balance-amount;
        System.out.println("Balance after withdrawal: " + balance);
    }
}