
abstract class ATM {
    abstract void withdrawMoney(double amount);
    abstract void checkBalance();
    abstract void depositMoney(double amount);
}

class BankATM extends ATM {
    private double balance;
    public BankATM(double initialBalance) {
        this.balance = initialBalance;
    }
    void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
    void depositMoney(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}


public class Main {
    public static void main(String[] args) {
        ATM myATM = new BankATM(5000);  
        myATM.checkBalance();         
        myATM.withdrawMoney(1500);     
        myATM.depositMoney(2000);
        myATM.checkBalance();         
    }
}
