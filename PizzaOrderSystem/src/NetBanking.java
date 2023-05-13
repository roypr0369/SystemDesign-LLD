public class NetBanking extends PaymentMethod{
    @Override
    public double processingFee(double cost) {
        return 0.75 + cost;
    }

    @Override
    public void exitPayment() {
        super.exitPayment();
    }
}
