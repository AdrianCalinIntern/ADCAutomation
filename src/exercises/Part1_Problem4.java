package exercises;

import java.util.Scanner;

public class Part1_Problem4 {
    public static void main(String[] args) {
        // Area of a Triangle (Easy-Medium):
        // Ask the user for base and height, calculate and print the area (0.5 * base * height).

        Scanner input = new Scanner(System.in);

        //Reading the base
        System.out.println("Enter the triangle base : ");
        String baseFromUser = input.next();
        //End of reading
        //Store the input in variable
        double base = Double.parseDouble(baseFromUser);

        //Reading the height
        System.out.println("Enter the triangle height : ");
        String heightFromUser = input.next();
        //End of reading
        //Store the input in variable
        double height = Double.parseDouble(heightFromUser);

        //Calculating
        System.out.println("Triangle area : " +  0.5 * base * height);
    }
}
