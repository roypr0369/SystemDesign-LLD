public class Mushroom extends  ToppingClassifier{
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 30;
    }
}
