package exercises;

import java.util.Scanner;

public class Part1_Problem10 {
    public static void main(String[] args) {
        // Simple Quiz (Medium): Prepare a few multiple-choice questions with answers (stored in variables).
        // Ask the user for answers and keep track of the score. Print the final score.

        Scanner input = new Scanner(System.in);
        System.out.println("Q1 : Lorem ipsum dolor sit amet (a,b is correct) : \n a) test 1 \n b) test 2 \n c) test 3");
        String q1answer = input.nextLine();

        System.out.println("Q2 : Lorem ipsum dolor sit amet (a,b,c is correct): \n a) test 4 \n b) test 5 \n c) test 6");
        String q2answer = input.nextLine();

        int score = 0;
        if(q1answer.contains("ab") && q2answer.contains("abc") ){
            score = 2;
        } else if (q1answer.contains("ab") || q2answer.contains("abc"))
        {
            score = 1;
        }
        System.out.println("Your score : " + score);
    }
}
