package exercises;

import java.util.Scanner;

public class Part1_Problem7 {
    public static void main(String[] args) {
        //Simple Commission Calculator (Medium):
        // Ask for the sales amount and commission rate.
        // Calculate and print the commission earned (commission rate * sales amount).

        Scanner input = new Scanner(System.in);

        //Reading the amount
        System.out.println("Enter the amount : ");
        String amountFromUser = input.next();
        //End of reading
        //Store the input in variable
        double amountValue = Double.parseDouble(amountFromUser);

        //Reading the commission rate
        System.out.println("Enter the commission rate : ");
        String commissionFromUser = input.next();
        //End of reading
        //Store the input in variable
        double commissionValue = Double.parseDouble(commissionFromUser);

        System.out.println("Commission earned :" + commissionValue * amountValue);

    }
}
