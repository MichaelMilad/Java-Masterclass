public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Generic Animal", "Big", 430);
//        doAnimalStuff(animal, "slow");
//
//        Dog dog = new Dog("Husky", "Average", 30);
//        doAnimalStuff(dog, "fast");

        Dog dog2 = new Dog("Yorkie", 14);
        doAnimalStuff(dog2, "slow");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
