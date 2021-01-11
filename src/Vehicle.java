public class Vehicle {

    String brand;
    double power;
    double maxSpeed;
    double weight;



    public Vehicle(String brand, double power, double maxSpeed, double weight) {
        this.brand = brand;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    public void convertPower(Vehicle vehicle){
        System.out.println("Мощность " + vehicle.getBrand() + " в киловаттах: " + vehicle.getPower() * 0.74);
    }
}
