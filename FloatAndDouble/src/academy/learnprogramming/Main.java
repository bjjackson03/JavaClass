package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("My Float Min Value: " + myMinFloatValue);
        System.out.println("My Float Max Value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("My Double Min Value: " + myMinDoubleValue);
        System.out.println("My Double Max Value: " + myMaxDoubleValue);

        // float and double does not need to be specified with the 'd' but its good practice
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00d / 3.00d;

        System.out.println("My Int Value: " + myIntValue);
        System.out.println("My Float Value: " + myFloatValue);
        System.out.println("My Double Value: " + myDoubleValue);

        // Challenge!
        double InputInPounds = 50d;
        double ConvertToKilo = InputInPounds * 0.45369237d;

        System.out.println(InputInPounds + " Pounds in Kilograms is equal to " + ConvertToKilo);
    }
}
