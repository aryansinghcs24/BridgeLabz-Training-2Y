interface PaymentMethod {
    void pay(double amount);
}

class UPI implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI.");
    }
}

class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}

class Wallet implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Wallet.");
    }
}

public class Digital_Interface {
    public static void main(String[] args) {
        PaymentMethod upi = new UPI();
        PaymentMethod card = new CreditCard();
        PaymentMethod wallet = new Wallet();

        upi.pay(1000.0);    
        card.pay(2000.0);    
        wallet.pay(500.0);   
    }
}
