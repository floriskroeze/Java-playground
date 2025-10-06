public class Challenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6, 0));
    }

    public static double convertToCentimeters(int heightInInches) {
        double inchInCentimeters = 2.54;

        return heightInInches * inchInCentimeters;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        int footInInches = 12;

        int totalHeightInInches = (heightInFeet * footInInches) + heightInInches;

        return convertToCentimeters(totalHeightInInches);
    }
}
