package docrob;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Something: ");
        String str = input.nextLine();

        System.out.println("You Entered: \"" + str + "\"");

        if(StringUtils.isNumeric(str)) {
            System.out.println("\"" + str + "\" is a number");
        } else {
            System.out.println("\"" + str + "\" is not a number");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(str));
        System.out.println("Reversed: " + StringUtils.reverse(str));
    }
}