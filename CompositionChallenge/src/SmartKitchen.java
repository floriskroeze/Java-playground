public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker("Dolce gusto", "nespresso", false);
        this.dishWasher = new DishWasher("Washy 1000", "Samsung", false);
        this.iceBox = new Refrigerator("Coolboy", "Samsung", false);

    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        brewMaster.setWorkToDo(coffeeFlag);
        iceBox.setWorkToDo(fridgeFlag);
        dishWasher.setWorkToDo(dishWasherFlag);
    }

    public void doKitchenThings() {
        brewMaster.brewCoffee();
        iceBox.orderFood("Pizza");
        dishWasher.doDishes();
    }
}

class Appliance {
    private String model;
    private String manufacturer;
    private boolean WorkToDo;

    public Appliance(String model, String manufacturer, boolean hasWorkToDo) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.WorkToDo = hasWorkToDo;
    }

    public boolean hasWorkToDo() {
        return WorkToDo;
    }

    public void setWorkToDo(boolean workToDo) {
        WorkToDo = workToDo;
    }
}

class Refrigerator extends Appliance {

    public Refrigerator(String model, String manufacturer) {
        this(model, manufacturer, false);
    }

    public Refrigerator(String model, String manufacturer, boolean hasWorkToDo) {
        super(model, manufacturer, hasWorkToDo);
    }

    public void orderFood(String food) {
        if(hasWorkToDo()) {
            System.out.println(food + " has been ordered");
            setWorkToDo(false);
        }
    }
}

class DishWasher extends Appliance {

    public DishWasher(String model, String manufacturer) {
        this(model, manufacturer, false);
    }

    public DishWasher(String model, String manufacturer, boolean hasWorkToDo) {
        super(model, manufacturer, hasWorkToDo);
    }

    public void doDishes() {
        if(hasWorkToDo()) {
            System.out.println("The dishes have been done");
            setWorkToDo(false);
        }
    }
}

class CoffeeMaker extends Appliance {
    public CoffeeMaker(String model, String manufacturer) {
        this(model, manufacturer, false);
    }

    public CoffeeMaker(String model, String manufacturer, boolean hasWorkToDo) {
        super(model, manufacturer, hasWorkToDo);
    }

    public void brewCoffee() {
        if(hasWorkToDo()) {
            System.out.println("A delicious cup of steaming hot coffee is being brewed");
            setWorkToDo(false);
        }
    }
}
