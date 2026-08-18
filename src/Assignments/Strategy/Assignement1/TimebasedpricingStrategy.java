package Assignments.Strategy.Assignement1;

public class TimebasedpricingStrategy implements PricingStrategy {
    @Override
    public PricingType supporttype() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double calculate(RideDetails rideDetails) {
        return Fare.BASE_FARE  * Fare.PER_MINUTE_RATE * rideDetails.getDuration();
    }
}
