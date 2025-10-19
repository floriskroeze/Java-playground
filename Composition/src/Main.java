public class Main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208", "dell", "240");
        Monitor monitor = new Monitor("27ich beast", "acer", 27, "2540 x 1440");
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer personalComputer = new PersonalComputer("2208", "Dell", computerCase, monitor, motherBoard);

//        personalComputer.getMonitor().drawPixelAt(10, 10, "red");
//        personalComputer.getComputerCase().pressPowerButton();
//        personalComputer.getMotherBoard().loadProgram("IntelliJ IDEA");

        personalComputer.powerUp();

    }
}
