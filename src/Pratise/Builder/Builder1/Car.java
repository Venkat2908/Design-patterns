package Pratise.Builder.Builder1;

public class Car {
    private String engine;
    private String wheels;
    private String Seats;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels='" + wheels + '\'' +
                ", Seats='" + Seats + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setSeats(String seats) {
        Seats = seats;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
