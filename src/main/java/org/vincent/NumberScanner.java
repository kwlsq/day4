package org.vincent;
import java.util.Scanner;

public class NumberScanner {
    public static void inputReader(){
        Scanner scanner = new Scanner(System.in);
        String answer;
        StringBuilder numberOutput = new StringBuilder();
        do {
            System.out.println("Enter a random number");
            numberOutput.append(scanner.nextLine());

            numberOutput.append(",");

            System.out.println("Add another number? y/n");
            answer = scanner.nextLine();
        } while(answer.equalsIgnoreCase("y"));
        numberOutput.deleteCharAt(numberOutput.length()-1);

        System.out.println("Numbers inputted: " + numberOutput.toString());
    }
}
