package Pratise.Builder.Decorator;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public  CoffeeDecorator (Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getdescription() {
        return coffee.getdescription();
    }

    @Override
    public double getprice() {
        return coffee.getprice();
    }
}
