package app;

import org.apache.commons.lang3.StringUtils;
import utils.Input;

public class AppMain {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        String userInput = input.getString();

        System.out.println("Your string is numeric: " + StringUtils.isNumeric(userInput));
        System.out.println("Your string flipped: " + StringUtils.swapCase(userInput));
        System.out.println("Your string reversed: " + StringUtils.reverse(userInput));
    }
}
