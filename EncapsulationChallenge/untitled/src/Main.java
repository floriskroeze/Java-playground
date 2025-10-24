import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                
                
                
                ###################################
                # Dit is een astrologie programma #
                ###################################
                
                _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
                """);
        System.out.println("Hallo wat is jouw naam?");
        String name = scanner.nextLine();
        System.out.println("Aangenaam " + name + ". Welke maand ben je geboren ?");
        String birthMonth = scanner.nextLine();
        System.out.println("En welke dag?");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.println("Dan ben jij " + name + " een: " + getStarSign(birthMonth, birthDay));

    }

    public static String getStarSign(String birthMonth, int birthDay) {
        return switch (birthMonth.toLowerCase()) {
            case "januari" -> birthDay < 21 ? "Steenbok" : "Waterman";
            case "februari" -> birthDay < 19 ? "Waterman" : "Vissen";
            case "maart" -> birthDay < 21 ? "Vissen" : "Ram";
            case "april" -> birthDay < 21 ? "Ram" : "Stier";
            case "mei" -> birthDay < 22 ? "Stier" : "Tweelingen";
            case "juni" -> birthDay < 22 ? "Tweelingen" : "Kreeft";
            case "juli" -> birthDay < 24 ? "Kreeft" : "Leeuw";
            case "augustus" -> birthDay < 24 ? "Leeuw" : "Maagd";
            case "september" -> birthDay < 24 ? "Maagd" : "Weegschaal";
            case "oktober" -> birthDay < 24 ? "Weegschaal" : "Schorpioen";
            case "november" -> birthDay < 23 ? "Schorpioen" : "Boogschutter";
            case "december" -> birthDay < 22 ? "Boogschutter" : "Steenbok";
            default -> "Maand bestaat niet";
        };
    }
}
