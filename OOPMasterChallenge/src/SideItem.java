public class SideItem {
    private String type;
    private int price;

    public SideItem(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getType() {
        return type;
    }

    public static SideItem getSideItem(String type) {
        return switch (type) {
            case "ColeSlaw" -> new ColeSlaw();
            case "OnionRings" -> new OnionRings();
            default -> new Fries();
        };
    }
}

class Fries extends SideItem {

    public Fries() {
        super("Fries", 5);
    }
}

class ColeSlaw extends SideItem {

    public ColeSlaw() {
        super("Coleslaw", 3);
    }
}

class OnionRings extends SideItem {

    public OnionRings() {
        super("Onion rings", 6);
    }
}
