import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderItems {
    List<BasePizza> orderList;
    int items;
    double totalAmt;
    public OrderItems(){

    }
    public void addPizza(String pizza){
        if(Objects.equals(pizza, "Margherita")){
            orderList.add(new Margherita());
            ++items;
        }else if(Objects.equals(pizza, "Farmhouse")){
            orderList.add(new Farmhouse());
            ++items;
        }else{
            System.out.println("Item is currently available");
            //Notify the Client when it is available
        }
    }
    public void addToppings(String topping, int id){
        if(id >= 0 && id < orderList.size()){
            BasePizza toppingPizza = null;
            if(Objects.equals(topping, "ExtraCheese")){
                toppingPizza = new ExtraCheese(orderList.get(id));
            }else if(Objects.equals(topping, "Mushroom")){
                toppingPizza = new Mushroom(orderList.get(id));
            }else if(Objects.equals(topping, "Jalepino")){
                toppingPizza = new Jalepino(orderList.get(id));
            }else{
                System.out.println("Item is currently unavailable");
                //Notify the Client when it is available
            }
            orderList.set(id, toppingPizza);
        }
    }

    public void calculateAmt(){
        for(BasePizza pizza: orderList){
            totalAmt += pizza.cost();
        }
    }

    public void initiatePayment(String Mode){
        if(totalAmt == 0) return;
        PaymentProcess process = new PaymentProcess(Mode, totalAmt);
    }
}
