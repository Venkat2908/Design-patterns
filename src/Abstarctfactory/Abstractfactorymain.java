package Abstarctfactory;

public class Abstractfactorymain {

    public  static  void  main (String [] args){
        VehicleFactory hondafactory = new HondaFactory();
        Vehicle honda = hondafactory.createfactory();
        honda.start();
        honda.stop();

        VehicleFactory toyatoFactory = new ToyatoFactory();

        Vehicle toyato  = toyatoFactory.createfactory();
        toyato.stop();
        toyato.start();
    }

}
