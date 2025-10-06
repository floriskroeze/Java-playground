public class Main {

    public static void main(String[] args) {
        int highscore = calculateScore(true, 800, 5, 100);
        System.out.println(highscore);
    }

    public static int calculateScore(
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
