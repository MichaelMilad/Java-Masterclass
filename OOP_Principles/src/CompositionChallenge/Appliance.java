package CompositionChallenge;

public class Appliance {
    private String name;
    private boolean hasWorkToDo = false;

    public Appliance(String name) {
        this.name = name;
    }

    public void setHasWorkToDo() {
        if (this.isHasWorkToDo()) {
            System.out.printf("Work is being done on %s ..!\n", this.name);
        } else {
            this.hasWorkToDo = true;
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
}

class Refrigerator extends Appliance {
    Refrigerator(String name) {
        super(name);
    }
}

class CoffeeMaker extends Appliance {
    CoffeeMaker(String name) {
        super(name);
    }
}

class DishWasher extends Appliance {
    DishWasher(String name) {
        super(name);
    }
}
