public class Main {
    public static void main(String[] args) {
        int value = 1;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            default -> System.out.println("Value was not 1 or 2");
        }

        System.out.println(getQuarter("MARCH"));
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case  "JANUARY", "FEBRUARY", "MARCH" -> "First";
            case  "APRIL", "MAY", "JUNE" -> "Second";
            case  "JULY", "AUGUST", "SEPTEMBER" ->  "third";
            case  "OCTOBER", "NOVEMBER", "DECEMBER" ->  "fourth";
            default -> "Error";
        };
    }
}
