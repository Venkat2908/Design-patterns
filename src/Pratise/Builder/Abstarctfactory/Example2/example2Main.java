package Pratise.Builder.Abstarctfactory.Example2;

public class example2Main {
    public  static  void main (String [] args){

       BrandFactory brandFactory = new BrancfactoryImpl();
       CarFactory carFactory = brandFactory.createfactory(Brandmodel.HONDA);
       Car car = carFactory.CreateFactory("civic");
       car.Display();
       car.drive();


    }
}
