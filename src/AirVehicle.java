public class AirVehicle extends Vehicle {
    double wingSpan;
    double minRunwayLength;


    public AirVehicle(String brand, double power, double maxSpeed, double weight, double wingSpan, double minRunwayLength) {
        super(brand, power, maxSpeed, weight);
        this.wingSpan = wingSpan;
        this.minRunwayLength = minRunwayLength;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public double getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(double minRunwayLength) {
        this.minRunwayLength = minRunwayLength;
    }


}
