package CompositionChallenge;

public class Main {
    public static void main(String[] args) {
        Refrigerator fridge = new Refrigerator("Shark");
        CoffeeMaker coffeeMaker = new CoffeeMaker("Moca");
        DishWasher dishWasher = new DishWasher("McClean");

        SmartKitchen kitchen =
                new SmartKitchen(fridge, dishWasher, coffeeMaker);

        kitchen.addWater();
        kitchen.addWater();
        kitchen.pourMilk();
        kitchen.pourMilk();
        kitchen.pourMilk();
        kitchen.loadDishWasher();
    }
}
