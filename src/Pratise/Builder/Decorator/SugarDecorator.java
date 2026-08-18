package Pratise.Builder.Decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getdescription() {
        return coffee.getdescription()+", Sugar";
    }

    @Override
    public double getprice() {
        return coffee.getprice()+5.0;
    }
}
