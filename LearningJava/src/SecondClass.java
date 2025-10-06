public class SecondClass {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        double theRemainder = myValuesTotal % 40.00d;

        boolean isNoRemainder = theRemainder == 0.00 ? true : false;

        System.out.println(isNoRemainder);

        if (!isNoRemainder) {
            System.out.println(theRemainder);
        }
    }
}
