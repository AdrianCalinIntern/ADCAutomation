package exercises;
import java.util.*;

public class Part1_Problem1 {
    public static void main(String[] args) {
        //Is it even or odd? Ask the user for an integer and print whether it's even or odd.
        System.out.println("Enter a number : ");

        //Reading the input from user
        Scanner input = new Scanner(System.in);
        String valueFromUser = input.next();
        //End of reading

        //Store the input in variable
        int userInput = Integer.parseInt(valueFromUser);

        //Verification
        if(userInput % 2 == 0){
            System.out.println(userInput + ", is even.");
        }
        else{
            System.out.println(userInput + ", is odd.");
        }
    }
}