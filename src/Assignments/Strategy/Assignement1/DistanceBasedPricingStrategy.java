package Assignments.Strategy.Assignement1;

public class DistanceBasedPricingStrategy implements PricingStrategy {
    @Override
    public PricingType supporttype() {
        return PricingType.DISTANCE_BASED;
    }

    @Override
    public Double calculate(RideDetails rideDetails) {
        return Fare.BASE_FARE  *Fare.PER_KILOMETER_RATE * rideDetails.getDistance();
    }
}
