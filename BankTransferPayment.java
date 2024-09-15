public class BankTransferPayment  extends payment{
    public void makePayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount);
    }
}
