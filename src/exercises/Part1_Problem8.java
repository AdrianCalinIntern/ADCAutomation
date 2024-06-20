package exercises;

import java.util.Scanner;

public class Part1_Problem8 {
    public static void main(String[] args) {
        //Gross Pay Calculator (Medium): Ask for hours worked and hourly rate.
        // Check for overtime (over 40 hours).
        // Calculate regular pay (hours * rate) and overtime pay (1.5 * rate for overtime hours).
        // Print the total gross pay (regular pay + overtime pay).

        Scanner input = new Scanner(System.in);

        //Reading the hours
        System.out.println("Enter the hours : ");
        String hoursUser = input.next();
        //End of reading
        //Store the input in variable
        double hoursValue = Double.parseDouble(hoursUser);

        //Reading the hourly rate
        System.out.println("Enter hourly rate : ");
        String hourlyRateFromUser = input.next();
        //End of reading
        //Store the input in variable
        double hourlyRate = Double.parseDouble(hourlyRateFromUser);



        double grossPayment;
        if (hoursValue > 40){
            grossPayment = (hourlyRate * 1.5) * (hoursValue - 40) + (40 * hourlyRate);
            System.out.println(grossPayment);
        }

        // gross pay



    }
}
