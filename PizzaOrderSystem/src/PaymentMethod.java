public abstract class PaymentMethod {
    public abstract double processingFee(double cost);
    public void exitPayment(){
        System.out.println("Payment Done Successfully");
    }
}
