import java.util.Objects;

public class PaymentProcess {
    String payment;
    double cost;
    PaymentMethod paymentMethod;
    PaymentProcess(String payment, double cost){
        this.payment = payment;
        this.cost = cost;
    }
    public void processPayment(){
        if(Objects.equals(payment, "Net Banking")){
            paymentMethod = new NetBanking();
        }else if(Objects.equals(payment, "Credit Card")){
            paymentMethod = new CreditCard();
        }else if(Objects.equals(payment, "Debit Card")){
            paymentMethod = new DebitCard();
        }else{
        }
        System.out.println("Payment method is" + payment);
        paymentMethod.processingFee(cost);
    }
}
