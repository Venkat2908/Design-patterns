package Decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getdescription() {
        return "Simple Coffee";
    }

    @Override
    public double getprice() {
        return 10.0;
    }
}
