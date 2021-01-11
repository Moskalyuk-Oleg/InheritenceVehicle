public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------");
        Passenger auto1 = new Passenger("Dodge",170,140,2100,4,12,"van",10);
        System.out.println(auto1.toString());
        auto1.calculateDistance(auto1, 4.5);
        auto1.convertPower(auto1);
        System.out.println("------------------------------------------------------------");

        Cargo truck1 = new Cargo("Peterbilt",600,120,8000,10,40,60000);
        System.out.println(truck1.toString());
        truck1.loadingTruck(truck1);
        truck1.convertPower(truck1);
        System.out.println("------------------------------------------------------------");

        Civil airplane1 = new Civil("Airbus",110000,900,560,79.8,2,555,true);
        System.out.println(airplane1.toString());
        airplane1.passengerCapacity(airplane1);
        airplane1.convertPower(airplane1);
        System.out.println("------------------------------------------------------------");

        Military fighter1 = new Military("MIG-29",100000,2400,18480,11.36,260,true,150);
        System.out.println(fighter1.toString());
        fighter1.convertPower(fighter1);
        fighter1.shootingGuns(fighter1);
        fighter1.checkEjection(fighter1);
        System.out.println("------------------------------------------------------------");







    }
}
