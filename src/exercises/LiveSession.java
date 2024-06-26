package exercises;

import java.util.Scanner;

public class LiveSession {
    public static void main(String[] args) {
        //Write a program that simulates a simple banking system. The program should:
        //1. Allow the user to check their balance.
        //2. Deposit money.
        //3. Withdraw money if the amount to be withdrawn does not exceed the current
        //balance.
        //4. Transfer money to a savings account if the amount does not exceed the current
        //balance.
        //5. The program should allow a single operation and then finish.

        //The program should start with an initial balance for the main and savings accounts and
        //handle each transaction by updating the balance accordingly. Ensure that all operations are
        //verified for validity (e.g., checking for sufficient funds before withdrawal or transfer).
        // Extra :

        //6. Pay and Stash Change – after payment or withdrawal from the main account the
        //   program saves any leftover change into the savings account. (hint: use Math class)
        //7. Allow the user to choose to display their balance converted to different currencies like
        //   EUR or RON using predefined conversion rates (e.g. 1 USD = 0.93 EUR and 1 USD = 4.63 RON)


        Scanner input = new Scanner(System.in);

        //declaring accountBalance and depositBalance
        double accountBalance = 10;
        double depositBalance = 5;
        int userInput = 0;

        while(userInput != 7 ){
            System.out.println("1 Check the Balance  \n2 Deposit money  \n3 Withdraw money \n4 Transfer money to a savings account \n5 Convert account balance into USD or EUR \n6 Pay and stash change \n7 Exit");
            //read the user input
            userInput = input.nextInt();

            if (userInput == 1) {
                System.out.println("Current balance account : " + accountBalance + "RON \n");
            }

            else if (userInput == 2) {
                System.out.println("Amount to add :");
                double ammountToAdd = input.nextDouble();
                accountBalance = accountBalance + ammountToAdd;
                System.out.println("Your new balance : " + accountBalance + "\n");
            }

            else if (userInput == 3) {
                System.out.println("Value to transfer to another account: ");
                float transferToAnotherAccount = input.nextFloat();
                if (transferToAnotherAccount > accountBalance)
                {
                    System.out.println("Insufficient found");
                } else
                {
                    accountBalance = accountBalance - transferToAnotherAccount;
                    System.out.println("Your new balance : " + accountBalance+ "\n");
                }
            }

            else if (userInput == 4){
                System.out.println("Value to transfer to saving account:  ");
                double transferToSavingAccount = input.nextFloat();
                if (transferToSavingAccount > accountBalance)
                {
                    System.out.println("Insufficient found");
                }
                else {
                    accountBalance = accountBalance - transferToSavingAccount;
                    depositBalance = depositBalance + transferToSavingAccount;
                    System.out.println("New account balance: " + accountBalance+ "\n");
                    System.out.println("New deposit balance: " + depositBalance+ "\n");
                }
            }

            else if (userInput == 5){
                System.out.println("Select : \n 1 for USD \n 2 for EUR");
                int option = input.nextInt();

                if(option == 1)
                    System.out.println("Account Balance in USD: " + accountBalance / 4.63+ "\n");
                else if (option == 2)
                    System.out.println("Account Balance in EUR: " + accountBalance / 0.93+ "\n");
                else System.out.println("Invalid option"+ "\n");
            }

            else if (userInput == 6) {
                System.out.println("Payment amount : ");
                double paymentAmount = input.nextDouble();
                accountBalance = accountBalance - paymentAmount;

                double change = accountBalance - Math.floor(accountBalance);
                if (change > 0){
                    depositBalance = depositBalance + change;
                    System.out.println(depositBalance);
                }
            }
            else if (userInput == 7) {
                System.out.println("Bye");
            }
            else System.out.println("Invalid choose !");

        }
        }
    }
