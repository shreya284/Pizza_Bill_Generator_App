public class Deluxe_Pizza extends Pizza{
    public Deluxe_Pizza(Boolean veg)
    {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraToppings() {}
}
