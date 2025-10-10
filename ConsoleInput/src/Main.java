public class Main {
    public static void main(String[] args) {
        String currentYear = "2025";
        String usersDateOfBirth = "1997";

        System.out.println(getInputFromConsole(Integer.parseInt(currentYear)));
        System.out.println(getInputFromScanner(Integer.parseInt(currentYear)));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, whats your name? ");
        System.out.println("Nice to meet you " + name + ", how are you today?");

        String birthyear = System.console().readLine("What is your birthyear " + name + "? ");
        int age = currentYear - Integer.parseInt(birthyear);

        return "" + age;
    }

    public static String getInputFromScanner(int currentYear) {

        return "";
    }
}
