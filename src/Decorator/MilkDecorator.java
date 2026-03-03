package Decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getdescription() {
        return coffee.getdescription()+",milk";
    }

    @Override
    public double getprice() {
        return coffee.getprice()+5.0;
    }
}
