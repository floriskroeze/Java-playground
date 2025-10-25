public class Drink {
    private String type;
    private int price;
    private char size;

    public Drink(String type, char size) {
        this(type, getPriceBaseOnSize(size), size);
    }

    public Drink(String type, int price, char size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public static int getPriceBaseOnSize(char size) {
        return switch(Character.toUpperCase(size)) {
            case 'S' -> 5;
            case 'L' -> 8;
            default -> 6;
        };
    }

    public String getType() {
        return type;
    }

    public static Drink getDrink(String type, char size) {
        return switch(type) {
            case "Sprite" -> new Sprite(size);
            case "DrPepper" -> new DrPepper(size);
            default -> new DietCoke(size);
        };
    }
}

class DietCoke extends Drink {
    public DietCoke(char size) {
        super("Diet coke", size);
    }
}

class Sprite extends Drink {
    public Sprite(char size) {
        super("Sprite", size);
    }
}

class DrPepper extends Drink {
    public DrPepper(char size) {
        super("Dr pepper", size);
    }
}