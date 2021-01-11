public class Civil extends AirVehicle {
    int passengerCount;
    boolean businessClass;

    public Civil(String brand, double power, double maxSpeed, double weight, double wingSpan, double minRunwayLength, int passengerCount, boolean businessClass) {
        super(brand, power, maxSpeed, weight, wingSpan, minRunwayLength);
        this.passengerCount = passengerCount;
        this.businessClass = businessClass;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "Civil{" +
                " brand='" + brand + '\'' +
                ", wingSpan=" + wingSpan +
                ", minRunwayLength=" + minRunwayLength +
                ", passengerCount=" + passengerCount +
                ", businessClass=" + businessClass +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                '}';
    }

    public void passengerCapacity(Civil civil) {
        if (civil.getPassengerCount() > 0 && civil.getPassengerCount() <= 555) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен еще один самолет");
        }
    }

}
