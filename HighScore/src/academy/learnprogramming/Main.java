package academy.learnprogramming;

public class Main {

    public static void mainHighScoreResults(String playerName, int playerScore){
        playerName = "Ronny";
        System.out.println("Results are in! " + playerName + " your final score is "
            + playerScore);
    }


    int playerScore = 1000;

    public static int HighScoreStats(int playerScore){

    if (playerScore >= 1000){
        return 1;
    }
    else if (playerScore >= 500){
        return 2;
    }
    else if (playerScore >= 100){
        return 3;
    }
    return 4;


    }
}
