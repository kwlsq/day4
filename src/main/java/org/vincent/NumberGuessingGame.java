package org.vincent;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGuessingGame {
    public static void numberGuesser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Number Guesser game!");
        System.out.println("Input your first number guess:");

        int randomInt = ThreadLocalRandom.current().nextInt(1, 101);
        int numberGuess = scanner.nextInt();
        int guessCounter = 1;

        do {
            if(numberGuess > randomInt){
                System.out.println("Too high!");
            } else if(numberGuess < randomInt) {
                System.out.println("Too low!");
            }
            guessCounter++;
            System.out.println("Input another number guess:");
            numberGuess = scanner.nextInt();
        } while (numberGuess!=randomInt);

        System.out.println("Congrats you guess the correct number with "+guessCounter+" tries!");
    }
}
