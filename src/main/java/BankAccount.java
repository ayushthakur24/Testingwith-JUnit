public class BankAccount {
    private double balance;
    private double minimumBalance;

    public BankAccount(double balance, double minimumBalance){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public double withdraw(double amount){
        if(minimumBalance <= balance - amount){
            balance -= amount;
            return balance;
        }
        else{
            throw new RuntimeException("Violating minimum amount policy");
        }
    }

    public double deposit(double amount){
        return balance += amount;

    }
}
