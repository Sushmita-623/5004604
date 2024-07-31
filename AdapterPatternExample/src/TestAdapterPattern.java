public class TestAdapterPattern {
    public static void main(String[] args) {
        // Using PayPal adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalPayment());
        paypalProcessor.processPayment(100.0);

        // Using Stripe adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripePayment());
        stripeProcessor.processPayment(200.0);
    }
}
