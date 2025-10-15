public class Main {
    public static void main(String[] args) {
        Car audi = new Car();

        audi.setMake("Audi");
        audi.setModel("Q5");
        audi.setColor("Black");
        audi.setDoors(5);
        audi.setConvertible(false);

        audi.describeCar();

        Car tesla = new Car();
        tesla.setMake("Tesla");
        tesla.setModel("Model Y");
        tesla.setColor("Blue");
        tesla.setDoors(5);
        tesla.setConvertible(true);

        tesla.describeCar();
    }
}
