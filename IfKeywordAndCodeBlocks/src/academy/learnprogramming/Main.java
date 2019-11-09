package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score is less than 5000 but more than 1000");
//        }
//            else if(score < 1000) {
//            System.out.println("You scored in the bottom 20%, yikes.");
//        }
//            else if (score > 2000 && score < 3000) {
//            System.out.println("My dude, you are simply average");
//        }
//            else if (score == 5000) {
//            System.out.println("Perfect Score!  WTG!");
//        }
//            else {
//                System.out.println("Please retake test. No score was recorded.");
//            }
            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }






    }
}
