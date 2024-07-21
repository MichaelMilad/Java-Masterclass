package CompositionChallenge;

public class SmartKitchen {
    private Refrigerator fridge;
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;

    public SmartKitchen(
            Refrigerator fridge, DishWasher dishWasher, CoffeeMaker coffeeMaker
    ) {
        this.fridge = fridge;
        this.dishWasher = dishWasher;
        this.coffeeMaker = coffeeMaker;
    }

    public void addWater() {
        coffeeMaker.setHasWorkToDo();
    }

    public void pourMilk() {
        fridge.setHasWorkToDo();
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkToDo();
    }
}
