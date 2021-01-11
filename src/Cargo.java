public class Cargo extends LandVehicle {

    double carryingCapacity;

    public Cargo(String brand, double power, double maxSpeed, double weight, int wheelCount, double gasMileage, double carryingCapacity) {
        super(brand, power, maxSpeed, weight, wheelCount, gasMileage);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                " brand='" + brand + '\'' +
                ", carryingCapacity=" + carryingCapacity +
                ", wheelCount=" + wheelCount +
                ", gasMileage=" + gasMileage +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                '}';
    }

    public void loadingTruck(Cargo cargo) {
        if (cargo.getCarryingCapacity() >= 0 && cargo.getCarryingCapacity() <= 60000) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

}
