package exercises;

import java.util.Scanner;

public class Part3_Problem1 {
    //1. Write a Java function named greet that takes a single parameter: language and prints "Hello, World!"
    // to the console translated in the specified language.
    // Choose the languages as you please.
    // If no language is selected, English will be used by default.
    // If the language is not recognized, print “Sorry, I don't speak that language.”.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 for italian \n2 for german");
        String language;

        while (scanner.hasNextLine()) {
            language = scanner.nextLine();
            String x = greet(language);
            System.out.println(x);
            break;
        }
        scanner.close();
    }

    static String greet(String language){
        if (language.isEmpty()) {
            return "Hello, World";
        } else if (language.equals("1")) {
            return "Saluti Lume";
        }else if (language.equals("2")) {
            return "Hallo Welt";
        }
        else return "Sorry, I don't speak that language";
    }
}