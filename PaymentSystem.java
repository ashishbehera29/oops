public class PaymentSystem {
    public static void main(String[] args) {
        
        payment payment1 = new CreditCardPayment();  // Polymorphism
        payment payment2 = new PayPalPayment();      // Polymorphism
        payment payment3 = new BankTransferPayment(); // Polymorphism
        
        
        payment1.makePayment(100.0);  
        payment2.makePayment(200.0);  
        payment3.makePayment(300.0);  
    }
}