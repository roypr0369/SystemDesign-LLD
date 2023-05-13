public class Jalepino extends ToppingClassifier{
    BasePizza basePizza;

    public Jalepino(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 40;
    }

}
