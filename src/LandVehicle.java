public class LandVehicle extends Vehicle {

    int wheelCount;
    double gasMileage;


    public LandVehicle(String brand, double power, double maxSpeed, double weight, int wheelCount, double gasMileage) {
        super(brand, power, maxSpeed, weight);
        this.wheelCount = wheelCount;
        this.gasMileage = gasMileage;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public double getGasMileage() {
        return gasMileage;
    }

    public void setGasMileage(double gasMileage) {
        this.gasMileage = gasMileage;
    }


}
