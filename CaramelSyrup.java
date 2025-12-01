public class CaramelSyrup implements CoffeeDecorator{
    public CaramelSyrup(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Caramel Syrup"
;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + "40.00"; // ₱40.00 extra
    }
}