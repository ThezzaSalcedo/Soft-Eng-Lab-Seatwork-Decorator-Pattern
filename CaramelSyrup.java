public class CaramelSyrup implements CoffeeDecorator{
    
    private Coffee wrappedCoffee;

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Caramel Syrup"
;
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 40.00; // ₱40.00 extra
    }

     @Override
    public void setCoffee(Coffee coffee) {
        wrappedCoffee = coffee;
    }
}
