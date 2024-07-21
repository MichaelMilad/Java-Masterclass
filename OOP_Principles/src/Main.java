public class Main {
    public static void main(String[] args) {

        Motherboard mb = new Motherboard("H61", "GIGABYTE", 4, 1, "BiosV2");
        ComputerCase myCase = new ComputerCase("2208", "Tower", "450W PS");
        Monitor monitor =
                new Monitor("27\"Sam144HZ", "Samsung", 27, "2540 * 1440");

        PersonalComputer PC =
                new PersonalComputer("V1", "Michael", monitor, mb, myCase);

//        PC.getMonitor().drawPixelAt(10, 20, "Cyan");
//        PC.getMotherboard().loadProgram("League of Legends");
//        PC.getComputerCase().pressPowerButton();

        PC.powerUp();
    }
}
