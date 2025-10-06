public class ChallengeTwo {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3661));
        System.out.println(getDurationString(3661));
        System.out.println(getDurationString(359));
        System.out.println(getDurationString(50,3661));
        System.out.println(getDurationString(-50,59));
    }

    public static String getDurationString(int seconds){

        if (!(seconds >= 0)) {
            return "Invalid value for seconds(" + seconds + "), must be a positive integer value";
        }

        int minutes = seconds / 60;
        int secondsLeft = seconds % 60;

        return getDurationString(minutes, secondsLeft);
    }

    public static String getDurationString(int minutes, int seconds){

        if (seconds < 0 || seconds > 59) {
            return "Invalid value for seconds(" + seconds + "), must be a int value between 0 and 59";
        }

        if (!(minutes >= 0)) {
            return "Invalid value for minutes(" + minutes + "), must be a positive integer value";
        }

        int hours = minutes / 60;
        int minutesLeft = minutes % 60;

        return hours + "h " + minutesLeft + "m " + seconds + "s";
    }
}
