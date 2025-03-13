import java.util.InputMismatchException;
import java.util.Scanner;

class Entrance {

    private static Scanner reader = new Scanner(System.in);

    public Entrance() {}

    public static byte readByte(String message) {
        while (true) {
            System.out.println(message);
            try {
                Byte input = reader.nextByte();
                reader.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
                reader.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                int input = reader.nextInt();
                reader.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
                reader.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            System.out.println(message);
            try {
                String input = reader.nextLine();
                if (input.contains(".")) throw new InputMismatchException("");
                input = input.replace(",", ".");
                Float num = Float.parseFloat(input);
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.println(message);
            try {
                String input = reader.nextLine();
                if (input.contains(".")) throw new InputMismatchException("");
                input = input.replace(",", ".");
                Double num = Double.parseDouble(input);
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.println(message);
            try {
                String input = reader.nextLine();
                if (input.length() != 1) throw new BadInputException(
                    "Input only one char at a time"
                );
                return input.charAt(0);
            } catch (BadInputException e) {
                System.out.println("Format error: " + e.getMessage());
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            try {
                String input = reader.nextLine();
                if (input.length() < 2) throw new BadInputException(
                    "Cant take empty strings"
                );
                return input;
            } catch (BadInputException e) {
                System.out.println("Format error: " + e.getMessage());
            }
        }
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.println(message);
            try {
                String input = reader.nextLine();
                if (input.length() != 1) throw new BadInputException(
                    "Enter only one char no more"
                );
                if (
                    input.toLowerCase().charAt(0) != 'y' &&
                    input.toLowerCase().charAt(0) != 'n'
                ) throw new BadInputException(
                    "Only input y for yes or n for no"
                );
                return input.charAt(0) == 'y' ? true : false;
            } catch (BadInputException e) {
                System.out.println("Format error: " + e.getMessage());
            }
        }
    }
}
