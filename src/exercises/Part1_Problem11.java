package exercises;

import java.util.Scanner;

public class Part1_Problem11 {
    public static void main(String[] args) {
        //Simple Unit Converter (Medium): Ask for a value and a unit (e.g., cm, inches, kg, lbs).
        // Offer options to convert to another unit and print the result.

        Scanner input = new Scanner(System.in);
        System.out.println("Value in cm: ");
        double value = input.nextDouble();

        System.out.println("Unit : \n 1. cm to inches, \n 2.cm to kg ");
        int unit = input.nextInt();

        if (unit == 1)
            System.out.println(value * 0.3937);
        else if (unit == 2) {
            System.out.println(value * 1000);
        }
    }
}
