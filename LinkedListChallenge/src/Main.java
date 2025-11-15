import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        LinkedList<Place> places = new LinkedList<>();


        places.add(new Place("Adelaide", 1374));
        places.add(new Place("Alice Springs", 2771));
        places.add(new Place("Brisbane", 917));
        places.add(new Place("Darwin", 3972));
        places.add(new Place("Melbourne", 877));
        places.add(new Place("Perth", 3923));

        var iterator = places.listIterator();

        while (flag) {
            optionsMenu();

            switch (scanner.nextLine().toUpperCase()) {
                case "F", "FORWARD" -> goForward(iterator);
                case "B", "BACKWARD" -> goBackward(iterator);
                case "L", "LIST PLACES" -> System.out.println(places);
                case "M", "MENU" -> optionsMenu();
                case "Q", "QUIT" -> flag = false;
                default -> System.out.println("Invalid input");

            }
        }
    }

    public static void optionsMenu() {
        System.out.printf("""
                \nAvailable actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }

    private static void goForward(ListIterator<Place> iterator) {
        if (!iterator.hasNext()) {
            System.out.println("No next place found");
            return;
        }

        System.out.println(iterator.next());
    }

    private static void goBackward(ListIterator<Place> iterator) {
        if (!iterator.hasPrevious()) {
            System.out.println("No previous place found");
            return;
        }

        System.out.println(iterator.previous());
    }
}
