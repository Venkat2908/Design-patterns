package Pratise.Builder.Abstarctfactory.Example2;

public class BMWFactory implements CarFactory  {
    @Override
    public Car CreateFactory(String Model) {
        switch (Model.toLowerCase()){
            case "X5":
                return new City("X5","BMW");
            case "M3":
                return new Civic("M3","BMW");
            case "X1":
                return new Civic("X1","BMW");
            default:
                throw new IllegalArgumentException("There are no brands in BMW");
        }
    }
}
