public class Milk implements CoffeeDecorator{
    private Coffee wrappedCoffee;

    @Override
    public String getDescription() {
       return wrappedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 25.00;
    }
     @Override
    public void setCoffee(Coffee coffee) {
        wrappedCoffee = coffee;
    }
}
