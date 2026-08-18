package Assignments.Strategy.Assignement1;

public interface PricingStrategy {
    PricingType supporttype();
    public Double calculate(RideDetails rideDetails);
}
