package Pratise.Builder.Abstarctfactory.Example2;

public class HondaFactory implements CarFactory {
    @Override
    public Car CreateFactory(String Model) {
        switch (Model.toLowerCase()){
            case "city":
                return new City("City","HONDA");
            case "civic":
                return new Civic("CIVIC","HONDA");
            default:
                throw new IllegalArgumentException("There are no brands in honda");
        }


    }
}
