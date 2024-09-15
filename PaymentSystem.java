public class PaymentSystem {
    public static void main(String[] args) {
        
        payment payment1 = new CreditCardPayment();  // Polymorphism
        payment payment2 = new PayPalPayment();      // Polymorphism
        payment payment3 = new BankTransferPayment(); // Polymorphism
        
        
        payment1.makePayment(100.0);  // Output: Processing credit card payment of $100.0
        payment2.makePayment(200.0);  // Output: Processing PayPal payment of $200.0
        payment3.makePayment(300.0);  // Output: Processing bank transfer payment of $300.0
    }
}