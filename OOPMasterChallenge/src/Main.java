public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();
//
//        Burger burger = new Burger("Regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder mealOrder = new MealOrder();
//        mealOrder.setDrinkSize("LARGE");
//        mealOrder.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        mealOrder.printItemizedList();

        MealOrder secondMeal = new MealOrder("deluxe", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO", "KETCHUP", "ONIONRINGS");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();

    }
}