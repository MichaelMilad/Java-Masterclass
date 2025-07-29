public class Main {
    public static void main(String[] args) {
        Car car = new Car(9, "BMW M5");
        runRace(car);

        Car mitsubishi = new Mitsubishi(10, "FerrariX21");
        runRace(mitsubishi);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.accelerate();
        car.brake();
    }
}
