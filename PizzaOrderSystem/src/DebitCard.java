public class DebitCard extends PaymentMethod{
    @Override
    public double processingFee(double cost) {
        return 0.50 + cost;
    }

    @Override
    public void exitPayment() {
        super.exitPayment();
    }
}
