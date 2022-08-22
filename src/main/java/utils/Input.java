package utils;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String input = getString();
        if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

    public int getInt(int min, int max) {
        return getInt(min, max, "Enter an int from " + min + " to " + max + " ");
    }

    public int getInt(int min, int max, String prompt) {
        while(true) {
            int input = getInt(prompt);
            if(input >= min && input <= max) {
                return input;
            }
        }
    }

    public int getInt(String prompt) {
        while(true) {
            System.out.print(prompt);
            if(scanner.hasNextInt()) {
                int input = scanner.nextInt();
                // get rid of whatever is left in the input buffer
                scanner.nextLine();
                return input;
            }
            // get rid of whatever is in the input buffer
            scanner.nextLine();
        }
    }

    public double getDouble(double min, double max, String prompt) {
        while(true) {
            double input = getDouble(prompt);
            if(input >= min && input <= max) {
                return input;
            }
        }
    }
    public double getDouble(double min, double max) {
        return getDouble(min, max, "Enter a double from " + min + " to " + max + " ");
    }

    public double getDouble(String prompt) {
        while(true) {
            System.out.print(prompt);
            if(scanner.hasNextDouble()) {
                double input = scanner.nextDouble();
                // get rid of whatever is left in the input buffer
                scanner.nextLine();
                return input;
            }
            // get rid of whatever is in the input buffer
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.yesNo("Continue? (y/n) "));

        System.out.println(input.getInt("Enter an int: "));
        System.out.println(input.getInt(10, 20, "Enter an int between 10 and 20: "));
        System.out.println(input.getInt(21, 30));

        System.out.println(input.getDouble("Enter a double: "));
        System.out.println(input.getDouble(0, 5.5, "Enter a double between 0 and 5.5: "));
        System.out.println(input.getDouble(5.6, 10));
    }
}
