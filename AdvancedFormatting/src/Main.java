public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub point";
        System.out.println(bulletIt);

        String textBlock = """
                Print a bulleted List
                    \u2022 First Point
                        \u2022 Second Point""";

        System.out.println(textBlock);

        int age = 35;

        System.out.printf("Your age is %.2f%nHow are you%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Your age is %.2f%n", (float) i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
