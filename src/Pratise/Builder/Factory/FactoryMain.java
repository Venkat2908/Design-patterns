package Pratise.Builder.Factory;

public class FactoryMain {
    public  static  void   main(String [] args){
        Phone android = PhoneFactory.getfactory(ModelType.ANDROID );
        Phone ios = PhoneFactory.getfactory(ModelType.IPHONE);

        ios.Display();
        android.Display();
    }
}
