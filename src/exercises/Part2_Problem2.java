package exercises;

import java.util.Scanner;

public class Part2_Problem2 {
    public static void main(String[] args) {
        // Keep asking the user for a number until they enter 0.
        // Check if the number is even or odd and print "Even" or "Odd".
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if(number % 2 == 0 && number > 0){
                System.out.println("even.");
            }
           if (number % 2 != 0 && number > 0) {
                System.out.println("odd.");
           }
        } while (number !=0);
    }
}
