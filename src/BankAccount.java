public class BankAccount {
//    rey idi copy paste jst refrence kosaam
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative: " + initialBalance);
        }
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new Exception("Insufficient funds. Balance: " + balance + ", Requested: " + amount);
        }
        balance -= amount;
        System.out.println("Withdrew: $" + amount + " | New balance: $" + balance);
    }

    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(500.0);
            account.withdraw(-200.0);  // ✅ Success
            account.withdraw(400.0);  // ❌ Insufficient funds

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());

        } finally {
            System.out.println("Transaction process complete.");
        }
    }
}