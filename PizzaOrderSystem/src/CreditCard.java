public class CreditCard extends PaymentMethod{
    @Override
    public double processingFee(double cost) {
        return cost + 0.20;
    }

    @Override
    public void exitPayment() {
        super.exitPayment();
    }
}
