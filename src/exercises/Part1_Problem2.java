package exercises;

import java.util.Scanner;

public class Part1_Problem2 {
    public static void main(String[] args) {
        // Positive, Negative, or Zero? Ask the user for a number and print if it's positive, negative, or zero.
        System.out.println("Enter a number : ");

        //Reading the input from user
        Scanner input = new Scanner(System.in);
        String valueFromUser = input.next();
        //End of reading

        //Store the input in variable
        int userInput = Integer.parseInt(valueFromUser);

        //Verification
        if (userInput == 0)
                System.out.println("The value is equal to 0");
        else if (userInput > 0)
            System.out.println("The value is positive");
        else
            System.out.println("The value is negative");
    }
}
