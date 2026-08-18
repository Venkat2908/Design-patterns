package Assignments.Strategy.Assignement1;

public class SurgePricingStrategy implements PricingStrategy {
    @Override
    public PricingType supporttype() {
        return PricingType.SURGE;
    }

    @Override
    public Double calculate(RideDetails rideDetails) {
        return Fare.BASE_FARE *Fare.SURGE_MULTIPLIER ;
    }
}
