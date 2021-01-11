public class Passenger extends LandVehicle {

    String bodyType;
    int passengerCount;


    public Passenger(String brand, double power, double maxSpeed, double weight, int wheelCount, double gasMileage, String bodyType, int passengerCount) {
        super(brand, power, maxSpeed, weight, wheelCount, gasMileage);
        this.bodyType = bodyType;
        this.passengerCount = passengerCount;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                " brand='" + brand + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", wheelCount=" + wheelCount +
                ", gasMileage=" + gasMileage +
                ", passengerCount=" + passengerCount +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                '}';
    }

    private double fuelConsumption (Passenger passenger, double time){
         double calculation = passenger.getMaxSpeed() * time / 100 * passenger.getGasMileage();
         return calculation;
    }

    public void calculateDistance (Passenger passenger, double time) {
        double distance = passenger.getMaxSpeed() * time;
        System.out.println("За время " + time + " ч., автомобиль " + passenger.getBrand() + " двигаясь с максимальной скоростью "+ passenger.getMaxSpeed() + " км/ч проедет "+ distance + " км и израсходует " + fuelConsumption(passenger, time) + " литров топлива.");
    }




}
