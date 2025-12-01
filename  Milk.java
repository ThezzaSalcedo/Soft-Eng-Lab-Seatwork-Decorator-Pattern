public class Milk implements CoffeeDecorator{
    private Coffee wrappedCoffee;

    @Override
    public String getDescription() {
        wrappedCoffee.getDescription() + ", Milk"
    }

    @Override
    public String getCost() {
        wrappedCoffee.getCost() +   "₱ 25.00";
 // ₱25.00 extra
    }
}