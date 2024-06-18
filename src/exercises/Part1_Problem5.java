package exercises;

import java.util.Scanner;

public class Part1_Problem5 {
    public static void main(String[] args) {
        // Distance Converter (Easy): Ask the user for distance in kilometers.
        // Convert it to miles (1 mile = 1.609 kilometers) and print the result.

        Scanner input = new Scanner(System.in);

        //Reading the base
        System.out.println("Enter the distance in km : ");
        String distanceInKilometersFromUser = input.next();
        //End of reading
        //Store the input in variable
        double distanceInKilometers = Double.parseDouble(distanceInKilometersFromUser);

        // Calculating :
        System.out.println("Your distance in miles : " + distanceInKilometers / 1.609);
    }
}
