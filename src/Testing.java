import java.util.Scanner;

public class Testing {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        Functions functions = new Functions();
        functions.consoleMenuNumberAction();
        System.out.print("Enter option: ");
        int option = sc.nextInt();
        if (option == 1)
        {
            functions.consoleMenuMultiplication();
            System.out.print("Enter option: ");
            int optionOne = sc.nextInt();
                switch (optionOne) {
                    case 1:
                        System.out.print("\nNumber one = ");
                        Functions.getFirstNumByte();

                        System.out.print("Number two = ");
                        Functions.getSecondNumByte();
                        Functions.optionMultiplyByte();
                        break;
                    case 2:
                        System.out.print("\nNumber one = ");
                        Functions.getFirstNumShort();

                        System.out.print("Number two = ");
                        Functions.getSecondNumShort();
                        Functions.optionMultiplyShort();
                        break;
                    case 3:
                        System.out.print("\nNumber one = ");
                        Functions.getFirstNumInt();

                        System.out.print("Number two = ");
                        Functions.getSecondNumInt();
                        Functions.optionMultiplyInt();
                        break;
                    case 4:
                        System.out.print("\nNumber one = ");
                        Functions.getFirstNumLong();

                        System.out.print("Number two = ");
                        Functions.getSecondNumLong();
                        Functions.optionMultiplyLong();
                        break;
                    case 5:
                        System.out.print("\nNumber one = ");
                        Functions.getFirstNumFloat();

                        System.out.print("Number two = ");
                        Functions.getSecondNumFloat();
                        Functions.optionMultiplyFloat();
                        break;
                    case 6:
                        System.out.print("\nNumber one = ");
                        Functions.getFirstNumDouble();

                        System.out.print("Number two = ");
                        Functions.getSecondNumDouble();
                        Functions.optionMultiplyDouble();
                        break;
                    case 7:
                        Functions.optionMultiplyBoolean();
                        break;
                    case 8:
                        functions.exit();
                        break;
                    default:
                        System.out.println("\n Enter a valid option!");
                }
        }
        else if (option == 2)
        {
            functions.consoleMenuDivision();
            System.out.print("Enter option: ");
            int optionTwo = sc.nextInt();
            switch (optionTwo) {
                case 1:
                    System.out.print("\nNumber one = ");
                    Functions.getFirstNumByte();

                    System.out.print("Number two = ");
                    Functions.getSecondNumByte();
                    Functions.optionDivideByte();
                    break;
                case 2:
                    System.out.print("\nNumber one = ");
                    Functions.getFirstNumShort();

                    System.out.print("Number two = ");
                    Functions.getSecondNumShort();
                    Functions.optionDivideShort();
                    break;
                case 3:
                    System.out.print("\nNumber one = ");
                    Functions.getFirstNumInt();

                    System.out.print("Number two = ");
                    Functions.getSecondNumInt();
                    Functions.optionDivideInt();
                    break;
                case 4:
                    System.out.print("\nNumber one = ");
                    Functions.getFirstNumLong();

                    System.out.print("Number two = ");
                    Functions.getSecondNumLong();
                    Functions.optionDivideLong();
                    break;
                case 5:
                    System.out.print("\nNumber one = ");
                    Functions.getFirstNumFloat();

                    System.out.print("Number two = ");
                    Functions.getSecondNumFloat();
                    Functions.optionDivideFloat();
                    break;
                case 6:
                    System.out.print("\nNumber one = ");
                    Functions.getFirstNumDouble();

                    System.out.print("Number two = ");
                    Functions.getSecondNumDouble();
                    Functions.optionDivideDouble();
                    break;
                case 7:
                    Functions.optionDivideBoolean();
                    break;
                case 8:
                    functions.exit();
                    break;
                default:
                    System.out.println("\n Enter a valid option!");
            }
        }
        else if (option == 3)
        {
            functions.exit();
        }
        else
        {
            System.out.println("\n Enter a valid option!");
        }
    }
}
