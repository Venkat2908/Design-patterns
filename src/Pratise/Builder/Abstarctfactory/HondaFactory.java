package Pratise.Builder.Abstarctfactory;

public class HondaFactory implements VehicleFactory {
    @Override
    public Vehicle createfactory() {
        return new Honda();
    }
}
