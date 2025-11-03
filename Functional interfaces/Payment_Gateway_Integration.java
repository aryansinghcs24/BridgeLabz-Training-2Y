interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Default refund of " + amount + " processed (generic).");
    }
}

class OldBankGateway implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("OldBank: Payment of " + amount + " processed.");
    }
}

class NewUPIGateway implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("UPI: Payment of " + amount + " processed.");
    }
    @Override
    public void refund(double amount) {
        System.out.println("UPI: Refund of " + amount + " processed with UPI logic.");
    }
}

public class Payment_Gateway_Integration {
    public static void main(String[] args) {
        PaymentProcessor oldBank = new OldBankGateway();
        PaymentProcessor upi = new NewUPIGateway();

        oldBank.processPayment(1000);
        oldBank.refund(500);  

        upi.processPayment(2000);
        upi.refund(800);      
    }
}
