public class BlackCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Black Coffee";
    }

    @Override
    public String getCost() {
        return "100.00"; // ₱100.00
    }
}