package Template;

public class Coffee extends Beverage {
    @Override
    boolean addCondiments() {
        return true;
    }

    @Override
    void brewBeverage() {
        System.out.println("The drink is brewed from Coffee");
    }

    @Override
    void addCondimentsBeverage() {
        System.out.println("The drink is adding condiments for Coffee");
    }
}
