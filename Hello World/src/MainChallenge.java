public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800, levelCompleted = 5, bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println(
                "Your next High Score is:: " +
                        calculateScore(true, 10000, 8, 200)
        );
    }

    private static int calculateScore(
            boolean gameOver,
            int score,
            int levelCompleted,
            int bonus
    ) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }
}
