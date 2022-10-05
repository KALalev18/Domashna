import java.util.Scanner;

public class Functions {
    private static byte firstNumByte;
    private static byte secondNumByte;

    private static short firstNumShort;
    private static short secondNumShort;

    private static int firstNumInt;
    private static int secondNumInt;

    private static long firstNumLong;
    private static long secondNumLong;

    private static float firstNumFloat;
    private static float secondNumFloat;

    private static double firstNumDouble;
    private static double secondNumDouble;

    private static boolean firstNumBoolean;
    private static boolean secondNumBoolean;

    public static Scanner sc = new Scanner(System.in);

    public static byte readByte() {
        return sc.nextByte();
    }

    public static short readShort() {
        return sc.nextShort();
    }

    public static int readInt() {
        return sc.nextInt();
    }

    public static long readLong() {
        return sc.nextLong();
    }

    public static float readFloat() {
        return sc.nextFloat();
    }

    public static double readDouble() {
        return sc.nextDouble();
    }

    public static boolean readBoolean() {
        return sc.nextBoolean();
    }

    public static byte getFirstNumByte() {
        firstNumByte = readByte();
        return firstNumByte;
    }

    public static void setFirstNumByte(byte firstNumByte) {
        Functions.firstNumByte = firstNumByte;
    }

    public static byte getSecondNumByte() {
        secondNumByte = readByte();
        return secondNumByte;
    }

    public static void setSecondNumByte(byte secondNumByte) {
        Functions.secondNumByte = secondNumByte;
    }

    public static short getFirstNumShort() {
        firstNumShort = readShort();
        return firstNumShort;
    }

    public static void setFirstNumShort(short firstNumShort) {
        Functions.firstNumShort = firstNumShort;
    }

    public static short getSecondNumShort() {
        secondNumShort = readShort();
        return secondNumShort;
    }

    public static void setSecondNumShort(short secondNumShort) {
        Functions.secondNumShort = secondNumShort;
    }

    public static int getFirstNumInt() {
        firstNumInt = readInt();
        return firstNumInt;
    }

    public static void setFirstNumInt(int firstNumInt) {
        Functions.firstNumInt = firstNumInt;
    }

    public static int getSecondNumInt() {
        secondNumInt = readInt();
        return secondNumInt;
    }

    public static void setSecondNumInt(int secondNumInt) {
        Functions.secondNumInt = secondNumInt;
    }

    public static long getFirstNumLong() {
        firstNumLong = readLong();
        return firstNumLong;
    }

    public static void setFirstNumLong(long firstNumLong) {
        Functions.firstNumLong = firstNumLong;
    }

    public static long getSecondNumLong() {
        secondNumLong = readLong();
        return secondNumLong;
    }

    public static void setSecondNumLong(long secondNumLong) {
        Functions.secondNumLong = secondNumLong;
    }

    public static float getFirstNumFloat() {
        firstNumFloat = readFloat();
        return firstNumFloat;
    }

    public static void setFirstNumFloat(float firstNumFloat) {
        Functions.firstNumFloat = firstNumFloat;
    }

    public static float getSecondNumFloat() {
        secondNumFloat = readFloat();
        return secondNumFloat;
    }

    public static void setSecondNumFloat(float secondNumFloat) {
        Functions.secondNumFloat = secondNumFloat;
    }

    public static double getFirstNumDouble() {
        firstNumDouble = readDouble();
        return firstNumDouble;
    }

    public static void setFirstNumDouble(double firstNumDouble) {
        Functions.firstNumDouble = firstNumDouble;
    }

    public static double getSecondNumDouble() {
        secondNumDouble = readDouble();
        return secondNumDouble;
    }

    public static void setSecondNumDouble(double secondNumDouble) {
        Functions.secondNumDouble = secondNumDouble;
    }

    public static boolean isFirstNumBoolean() {
        firstNumBoolean = readBoolean();
        return firstNumBoolean;
    }

    public static void setFirstNumBoolean(boolean firstNumBoolean) {
        Functions.firstNumBoolean = firstNumBoolean;
    }

    public static boolean isSecondNumBoolean() {
        secondNumBoolean = readBoolean();
        return secondNumBoolean;
    }

    public static void setSecondNumBoolean(boolean secondNumBoolean) {
        Functions.secondNumBoolean = secondNumBoolean;
    }

    public static void consoleMenuNumberAction() {
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                     Data type calculator                    |");
        System.out.println("|                    Choose a number action:                  |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|        1. multiplication                                    |");
        System.out.println("|        2. division                                          |");
        System.out.println("|        3. exit                                              |");
        System.out.println("+-------------------------------------------------------------+");
    }

    public static void consoleMenuDivision() {
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|             Data type calculator with division              |");
        System.out.println("|                 Choose of the types below:                  |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|        1. byte                                              |");
        System.out.println("|        2. short                                             |");
        System.out.println("|        3. int                                               |");
        System.out.println("|        4. long                                              |");
        System.out.println("|        5. float                                             |");
        System.out.println("|        6. double                                            |");
        System.out.println("|        7. boolean                                           |");
        System.out.println("|        8. exit                                              |");
        System.out.println("+-------------------------------------------------------------+");
    }

    public static void consoleMenuMultiplication() {
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|           Data type calculator with multiplication          |");
        System.out.println("|                 Choose of the types below:                  |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|        1. byte                                              |");
        System.out.println("|        2. short                                             |");
        System.out.println("|        3. int                                               |");
        System.out.println("|        4. long                                              |");
        System.out.println("|        5. float                                             |");
        System.out.println("|        6. double                                            |");
        System.out.println("|        7. boolean                                           |");
        System.out.println("|        8. exit                                              |");
        System.out.println("+-------------------------------------------------------------+");
    }

    public static void optionMultiplyByte() {
        System.out.println("\nResult: "+(firstNumByte*secondNumByte));
    }

    public static void optionDivideByte() {
        System.out.println("\nResult: "+(firstNumByte/secondNumByte));
    }

    public static void optionMultiplyShort() {
        System.out.println("\nResult: "+(firstNumShort*secondNumShort));
    }

    public static void optionDivideShort() {
        System.out.println("\nResult: "+(firstNumShort/secondNumShort));
    }

    public static void optionMultiplyInt() {
        System.out.println("\nResult: "+(firstNumInt*secondNumInt));
    }

    public static void optionDivideInt() {
        System.out.println("\nResult: "+(firstNumInt/secondNumInt));
    }

    public static void optionMultiplyLong() {
        System.out.println("\nResult: "+(firstNumLong*secondNumLong));
    }

    public static void optionDivideLong() {
        System.out.println("\nResult: "+(firstNumLong/secondNumLong));
    }

    public static void optionMultiplyFloat() {
        System.out.println("\nResult: "+(firstNumFloat*secondNumFloat));
    }

    public static void optionDivideFloat() {
        System.out.println("\nResult: "+(firstNumFloat/secondNumFloat));
    }

    public static void optionMultiplyDouble() {
        System.out.println("\nResult: "+(firstNumDouble*secondNumDouble));
    }

    public static void optionDivideDouble() {
        System.out.println("\nResult: "+(firstNumDouble/secondNumDouble));
    }

    public static void optionMultiplyBoolean() {
        System.out.println("\n Boolean type cannot be multiplied!");
    }

    public static void optionDivideBoolean() {
        System.out.println("\n Boolean type cannot be divided!");
    }

    public static void exit() {
        System.exit(-1);
    }
}
