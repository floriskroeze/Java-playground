import java.util.ArrayList;
import java.util.Comparator;

public class GroceryList {
    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }

    public void addItem(String[] items) {
            for (String i: items) {

            }
            System.out.println("New state of list: ");
            printSortedList();
    }

    public void removeItem(String item) {
        if (!getItems().contains(item)) {
            System.out.println("item is not on the list");
            return;
        }

        items.remove(item);
        System.out.println("New state of list: ");
        printSortedList();
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void printSortedList() {
        ArrayList<String> sortedList = new ArrayList<>(items);
        sortedList.sort(Comparator.naturalOrder());
        System.out.println(sortedList);
    }
}
