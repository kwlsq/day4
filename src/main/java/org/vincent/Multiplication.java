package org.vincent;

public class Multiplication {
    public static String multiplicator(int inputNumber){
        if(inputNumber<0){
            throw new IllegalArgumentException("Input must be bigger than 0");
        }
        StringBuilder result= new StringBuilder();

        for(int i=1;i<=inputNumber;i++){
            for(int j=1;j<=inputNumber;j++){
                result.append(i * j);
                if (j != inputNumber) {
                    result.append(" "); // Add space between numbers, but not after the last one
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
