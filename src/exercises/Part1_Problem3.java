package exercises;

import java.util.Scanner;

public class Part1_Problem3 {
    public static void main(String[] args) {
        // Leap Year Check (Easy-Medium): Prompt the user for a year.
        // Check if it's a leap year (divisible by 4 and not by 100, or divisible by 400).

        System.out.println("Enter a year : ");

        //Reading the input from user
        Scanner input = new Scanner(System.in);
        String valueFromUser = input.next();
        //End of reading

        //Store the input in variable
        int userInput = Integer.parseInt(valueFromUser);

        //Verification
        if(userInput % 4 == 0 && userInput % 100 != 0 || userInput % 400 == 0){
            System.out.println("Is it a leap year? : Yes");
        } else
            System.out.println("Is it a leap year? : No");
    }
}
