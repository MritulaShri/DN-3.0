public class PaymentProcessorTest {
    public static void main(String[] args) {
        // Using PayPal adapter
        PaypalGateway paypalGateway = new PaypalGateway();
        PaymentProcessor paypalProcessor = new PaypalAdapter(paypalGateway);
        paypalProcessor.processPayment(100.00);

        // Using Stripe adapter
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        stripeProcessor.processPayment(200.00);

        // Using Square adapter
        SquareGateway squareGateway = new SquareGateway();
        PaymentProcessor squareProcessor = new SquareAdapter(squareGateway);
        squareProcessor.processPayment(300.00);
    }
}
