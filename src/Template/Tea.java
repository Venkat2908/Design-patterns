package Template;

public class Tea extends Beverage {
    @Override
    boolean addCondiments() {
        return false;
    }

    @Override
    void brewBeverage() {
        System.out.println("The drink is brewed for tea");
    }

    @Override
    void addCondimentsBeverage() {
        System.out.println("The drink is adding condiments for tea");

    }
}
