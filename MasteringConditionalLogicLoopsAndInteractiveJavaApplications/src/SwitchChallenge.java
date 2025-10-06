public class SwitchChallenge {
    public static void main(String[] args) {
        System.out.println(getNATOAlphabetLetter('Z'));
    }

    public static String getNATOAlphabetLetter(char letter) {
        return switch (letter) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            case 'F' -> "Foxtrot";
            case 'G' -> "George";
            case 'H' -> "How";
            case 'I' -> "Item";
            case 'J' -> "Jig";
            case 'K' -> "King";
            case 'L' -> "Love";
            case 'M' -> "Mike";
            case 'N' -> "Nan";
            case 'O' -> "Oboe";
            case 'P' -> "Peter";
            case 'Q' -> "Queen";
            case 'R' -> "Roger";
            case 'S' -> "Sugar";
            case 'T' -> "Tare";
            case 'U' -> "Uncle";
            case 'V' -> "Victor";
            case 'W' -> "William";
            case 'X' -> "X-ray";
            case 'Y' -> "Yoke";
            case 'Z' -> "Zebra";
            default -> "This is not a valid letter";
        };
    }
}
