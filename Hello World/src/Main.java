public class Main {
    static int Score = 120;

    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        highScore = 12;

        if (highScore > 25) {
            highScore += 1000;
        }

        myMethod("Testing");

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore -= 1000;
        }
    }

    private static void myMethod(String input) {
        System.out.println("Method has been called!");
        System.out.println("Your Input Was:: " + input);
        System.out.println(Score);
    }
}