package exercises;

import java.util.Scanner;

public class Part2_Problem1 {
    public static void main(String[] args) {
        //· Ask the user for a number (use Scanner).
        //· Print its multiplication table to 12 (ex: 5 * 1 = 5, 5 * 2 = 10 …. 5 * 12 = 60), one on each row
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for(int i=1; i<=12;i++){
            String multiplicationTable = number + " * " + i + " = " + number * i + "  ";
            System.out.print(multiplicationTable);
        }
    }
}
