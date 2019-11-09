package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // testing int size
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;


        System.out.println("Integer Min Value: " + myMinIntValue);
        System.out.println("Integer Max Value: " + myMaxIntValue);
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value: " + (myMinIntValue - 1));

        // testing byte type sizes
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Min Byte Value: " + myMinByteValue);
        System.out.println("My Max Byte Value: " + myMaxByteValue);

        // testing short type sizessger
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Min Long Value: " + myMinShortValue);
        System.out.println("My Max Long Value: " + myMaxShortValue);

        // exploring long data type
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Min Long Value: " + myMinLongValue);
        System.out.println("My Max Long Value: " + myMaxLongValue);

        // printing out a number over the int type using long type
        long LargeNumberTest = 21474836478L;
        System.out.println(LargeNumberTest);

        // use casting to force it into the data type you need
        byte MyNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        // Challenge!  Not required, but need the L beside a long data type. Long does not need to be casted per se.
        byte ByteChall = 100;
        short ShortChall = 10320;
        int IntChall = 300000;
        long LongChall = 9879870009877L;
        long LongSumValue = 50000L + (10L * (ByteChall + ShortChall + IntChall));

        System.out.println(LongSumValue);
    }
}
