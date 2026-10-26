package Template;

public abstract class Beverage {


    final void prepare(){

        brew();
        mix();
        brewBeverage();

        if (addCondiments()) {
            addCondimentsBeverage();
        }


    }

    void brew(){
        System.out.println("The drink is brewed");
    }
    void mix(){
        System.out.println("the drink is mixed");
    }

    boolean addCondiments(){
        return true;
    }

    abstract void brewBeverage();
    abstract void addCondimentsBeverage();
}
