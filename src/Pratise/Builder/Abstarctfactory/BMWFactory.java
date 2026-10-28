package Pratise.Builder.Abstarctfactory;

public class BMWFactory implements VehicleFactory {
    @Override
    public Vehicle createfactory() {
        return new BMW();
    }
}
