package Pratise.Builder.Abstarctfactory.Example2;

public class SuzukiFactory implements CarFactory {
    @Override
    public Car CreateFactory(String Model) {
        switch (Model.toLowerCase()){
            case "swift":
                return new City("Swift","Suzuki");
            case "baleno":
                return new Civic("Baleno","Suzuki");
            case "breeza":
                return new Civic("Breeza","Suzuki");
            default:
                throw new IllegalArgumentException("There are no brands in Suzuki");
        }
    }
}
