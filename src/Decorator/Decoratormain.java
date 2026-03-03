package Decorator;

public class Decoratormain {
    public static  void main (String [] srgs){
        Coffee coffee = new SimpleCoffee();
        coffee= new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getdescription() +"   "+coffee.getprice());

    }
}
