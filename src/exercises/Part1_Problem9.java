package exercises;

import java.util.Scanner;

public class Part1_Problem9 {
    public static void main(String[] args) {
        // Simple Mad Libs (Medium):
        // Ask the user for various words (noun, verb, adjective, etc.) and
        // insert them into a pre-written story template.

        Scanner input = new Scanner(System.in);
        //Asking for noun, verb, adjective
        String userInputFromKeyboard = input.next();
        System.out.println(userInputFromKeyboard + " Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,");
    }
}
