public class Military extends AirVehicle {
    boolean ejectionSystem;
    int rocketsOnBoardCount;

    public Military(String brand, double power, double maxSpeed, double weight, double wingSpan, double minRunwayLength, boolean ejectionSystem, int rocketsOnBoardCount) {
        super(brand, power, maxSpeed, weight, wingSpan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.rocketsOnBoardCount = rocketsOnBoardCount;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getRocketsOnBoardCount() {
        return rocketsOnBoardCount;
    }

    public void setRocketsOnBoardCount(int rocketsOnBoardCount) {
        this.rocketsOnBoardCount = rocketsOnBoardCount;
    }

    @Override
    public String toString() {
        return "Military{" +
                " brand='" + brand + '\'' +
                ", wingSpan=" + wingSpan +
                ", minRunwayLength=" + minRunwayLength +
                ", ejectionSystem=" + ejectionSystem +
                ", rocketsOnBoardCount=" + rocketsOnBoardCount +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                '}';
    }
    public void shootingGuns(Military military) {
        if (military.getRocketsOnBoardCount() != 0) {
            System.out.println("Ракета пошла...");
        } else if(military.getRocketsOnBoardCount() == 0) {
            System.out.println("Боеприпасы отсутствуют");
        }
    }
    public void checkEjection(Military military) {
        if (ejectionSystem = true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}

