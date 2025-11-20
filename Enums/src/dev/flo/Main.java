package dev.flo;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);
        System.out.println(weekDay.name());
        System.out.println(weekDay.ordinal());

        System.out.println(getRandomDay());
        switchDayOfWeek(getRandomDay());
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case THURS -> System.out.println("Thursday is Day " + weekDayInteger);
            case FRI -> System.out.println("Friday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            case SUN -> System.out.println("Sunday is Day " + weekDayInteger);
            case MON -> System.out.println("Monday is Day " + weekDayInteger);
        }
    }
}
