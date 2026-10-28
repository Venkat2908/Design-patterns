package Pratise.Builder.Abstarctfactory.Example2;

public abstract class Car {

    String model;
    String Brand;


    public  Car(String model,String brand){
        this.model= model;
        this.Brand= brand;
    }

    public void Display(){
        System.out.println("The car brand is "+Brand);
        System.out.println("the car model is "+model);

    }

    public abstract void drive();
}
