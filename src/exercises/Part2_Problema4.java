package exercises;

import java.util.Scanner;

public class Part2_Problema4 {
    public static void main(String[] args) {
        //Ask the user for a number (use Scanner).
        //Check if number is prime
        //Print "Prime" or "Not Prime".
        // numar prim =: numărul 1 și numărul în sine.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = input.nextInt();

        if (number % number == 0 && number % 1 == 0){
            System.out.println("Test");
        }
    }
}
