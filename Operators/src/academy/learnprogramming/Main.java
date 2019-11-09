package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("The result of 1 + 2 is " + result);
        result = result - 1; // sutract 1.
        System.out.println("But if we subtract 1 we get " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 is " + result);

        result = result / 5; // Divide by 5
        System.out.println("When you divide by 5 you get " + result);

        result = result % 3; // the remainder of (4 % 3)
        System.out.println("The remainder of dividing by 3 is " + result);

        // result = result + 1;
        result++; // shorthand 1 + 1
        System.out.println("1 + 1 is equal to " + result);

        result--; // shorthand result - 1
        System.out.println("2 - 1 = " + result);

        result += 2; // shorthand to add 1 + 2
        System.out.println("1 + 2 is equal to " + result);

        result *= 20; // 3 * 20
        System.out.println("3 * 20 is equal to " + result);

        result /= 6; // result / 6 is 10
        System.out.println("60 / 6 is " + result);

        boolean isAlien = true;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("You straight bruh.");
        }
        if (isAlien) {
            System.out.println("It is an alien!!!");
            System.out.println("Run my dude!");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the top score");
        }

        int secondTopScore = 79;
        if ((secondTopScore >= 60) && (secondTopScore <= 80)) {
            System.out.println("you are mad average,son");
        }

        int passingTopScore = 80;
        if (passingTopScore >= 80 || secondTopScore <= 90) {
            System.out.println("Well done, you have passed.");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("Brah, you failed big time.");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("Successfully tested a boolean! 'if' ");
        }

        // ternary Operator!!
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Operator Challenge
        double var = 20.00d;
        double var2 = 80.00d;
        double var3 = (var + var2) * 100.00d;
        System.out.println("My Values Total is " + var3);
        double var4 = var3 % 40.00d;
        System.out.println("My Remainder is " + var4);

        boolean remainder = var4 == 0 ? true : false;
        if (remainder) {
            System.out.println("There is no remainder since the value is equal to " + remainder);
        }
        if (!remainder) {
            System.out.println("There is a remainder of " + remainder);
        }

          //  if remainder{
          //  System.out.println();

        //}
    }
}
