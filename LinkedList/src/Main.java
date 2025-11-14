import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Amsterdam");

        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);

        System.out.println(placesToVisit);

        removeElements(placesToVisit);

        System.out.println(placesToVisit);

        gettingElements(placesToVisit);

        printItinerary(placesToVisit);
        printItineraryTwo(placesToVisit);
        printItineraryThree(placesToVisit);

        testIterator(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Rotterdam");
        list.addLast("New York");
        list.addLast("Washington");
        list.addLast("London");
        list.addLast("Paris");
        list.addLast("Stockholm");
        list.addLast("Moscow");
        list.addLast("Kiev");

        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // Stack methods
        list.push("Alice Springs");
    }

    public static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Rotterdam");

        String s1 = list.remove();
        System.out.println(s1 + " Was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " Was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " Was removed");

        // Queue methods
        String p1 = list.poll();
        System.out.println(p1 + " Was removed");
        String p2 = list.pollFirst();
        System.out.println(p2 + " Was removed");
        String p3 = list.pollLast();
        System.out.println(p3 + " Was removed");

        // Stack methods
        String p4 = list.pop();
        System.out.println(p4 + " Was removed");

        System.out.println(list);
    }

    public static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved element = " + list.get(4));
        System.out.println("Retrieved element = " + list.getFirst());
        System.out.println("Retrieved element = " + list.getLast());

        // Queue method
        System.out.println("Element from element = " + list.element());

        // Stack methods
        System.out.println("Element from element = " + list.peek());
        System.out.println("Element from element = " + list.peekFirst());
        System.out.println("Element from element = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Start at: " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("End at: " + list.getLast());
    }

    public static void printItineraryTwo(LinkedList<String> list) {
        System.out.println("Start at: " + list.getFirst());
        String prevTown = list.getFirst();
        for (String town: list) {
            System.out.println("--> From: " + prevTown + " to " + town);
            prevTown = town;
        }
        System.out.println("End at: " + list.getLast());
    }

    public static void printItineraryThree(LinkedList<String> list) {
        System.out.println("Start at: " + list.getFirst());
        String prevTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + prevTown + " to " + town);
            prevTown = town;
        }
        System.out.println("End at: " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list ) {
        var iterator = list.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("Stockholm")) {
                iterator.add("Lake Wivenhoe");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }
}
