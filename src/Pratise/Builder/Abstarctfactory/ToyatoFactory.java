package Pratise.Builder.Abstarctfactory;

public class ToyatoFactory implements VehicleFactory {
    @Override
    public Vehicle createfactory() {
        return new Toyato();
    }
}
