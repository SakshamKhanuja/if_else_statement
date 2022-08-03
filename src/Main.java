public class Main {

    public static void main(String[] args) {

        // 1. "else" Statement

        // Stores a random score.
        int score = 5000;

        // "if" condition checks whether "score" was less than 5000.
        if (score < 5000) {
            // Code block will get SKIPPED, as the test condition fails.
            System.out.println("Your score was less than 5000.");
        } else {
            // Code block will get EXECUTED, as the "if" test condition failed.
            System.out.println("Got here!");
        }

        // 2. "else if" Statement

        // Updating score.
        score = 900;

        // "if" condition checks whether "score" is less than 5000 and greater or equal than 1000.
        if ((score < 5000) && (score >= 1000)) {
            // Code block will get SKIPPED, as the test condition fails.
            System.out.println("Your score was less than 5000, but greater or equal than 1000.");
        } else if(score < 1000) {
            /*
             * "else if" condition checks whether "score" is less than 1000.
             *
             * Code block will be EXECUTED as the above "if" test condition failed and this one got passed.
             */
            System.out.println("Your score was less than 1000.");
        } else {
            // Code block will be SKIPPED, as one of the above test condition was passed.
            System.out.println("Got here!");
        }

        // Updating score.
        score = 800;

        // Stores the current status whether a game is over.
        boolean gameOver = true;

        // Stores the number of level completed.
        int levelCompleted = 5;

        // Stores the score bonus.
        int bonus = 100;

        // Checks whether game is over.
        if (gameOver) {
            // Calculates the final score.
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore + ".");
        }

        // int savedFinalScore = finalScore;    // ERROR -> Cannot resolve 'finalScore' -> Variable scope

        // Updating score, levelCompleted and bonus.
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            // Calculates the final score.
            System.out.println("Your final score was " + (score + (levelCompleted * bonus)) + ".");
        }
    }
}
