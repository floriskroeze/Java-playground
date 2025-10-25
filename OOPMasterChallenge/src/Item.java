public class Item {
    private String name;
    private String type;
    private int price;
    private String size = "MEDIUM";

    public Item(String name, String type, int price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public double getBasePrice() {
        return this.price;
    }

    public double getAdjustedPrice() {
        return switch (size.toUpperCase()) {
            case "SMALL" -> this.price * 0.85;
            case "LARGE" -> this.price * 1.25;
            default -> this.price;
        };
    }

    public void printItem() {
        System.out.println("Item");
    }
}
