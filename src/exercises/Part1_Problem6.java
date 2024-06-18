package exercises;

import java.util.Scanner;

public class Part1_Problem6 {
    public static void main(String[] args) {
        //Temperature Converter (Easy-Medium): Ask the user for temperature in Celsius.
        // Offer a choice to convert to Fahrenheit (F = (C * 9/5) + 32) or Kelvin (K = C + 273.15).

        Scanner input = new Scanner(System.in);

        //Reading the base
        System.out.println("Enter the temperature in Celsius : ");
        String temperatureInCelsiusFromUser = input.next();
        //End of reading
        //Store the input in variable
        double temperatureInCelsius = Double.parseDouble(temperatureInCelsiusFromUser);


        System.out.println("For Fahrenheit press 1 ");
        System.out.println("For Kelvin press 2 ");
        String userOption = input.next();
        int userChoose = Integer.parseInt(userOption);


        if (userChoose == 1) {
             System.out.println(((temperatureInCelsius * 9) / 5) + 32);
        } else if (userChoose == 2) {
            System.out.println(temperatureInCelsius + 273.15);
        }
        else System.out.println("Invalid option");
    }
}
