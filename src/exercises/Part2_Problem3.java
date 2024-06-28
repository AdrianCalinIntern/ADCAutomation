package exercises;

import java.util.Scanner;

public class Part2_Problem3 {
    public static void main(String[] args) {
        //Factorial:
        //Ask the user for a non-negative number (use Scanner).
        //Calculate the factorial
        //Print the calculated factorial.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = input.nextInt();

        if(number >=0) {
            int suma = 1;
                for (int i = 1; i <= number; i++) {
                    suma = suma * i;
                }
            System.out.println(suma);
        }
        else
            System.out.println("Provide a positive value");
    }
}
