package ru.ssau.tk.Goose_kr.Game_TP.Game;

import java.io.IOException;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.println("Player 1 enter secret number (range 0 - 100): ");
            number = input.nextInt();
        }while (number < 0 || number > 100);
        //clearScreen();
        //clearConsole();

        int guess = 0;
        int tries = 0;

        while(guess != number)
        {
            tries = tries + 1;

            System.out.print("Player 2 enter your guess (range 0 - 100): ");
            guess = input.nextInt();
            if (guess > number)
            {
                System.out.printf("Your guess is higher than the correct number\n");
            }
            else if (guess < number)
            {
                System.out.printf("Your guess is lower than the correct number\n");
            }
            else if (guess == number)
            {
                System.out.printf("Congratulations! You guess the correct number\n");
                System.out.printf("Number of guesses: %d\n", tries);
                break;
            }
        }
    }

   /* private final static void clearConsole() {

        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }

        catch (IOException e )
        {
            e.printStackTrace();
        }
    }*/
    /*public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }*/
}
