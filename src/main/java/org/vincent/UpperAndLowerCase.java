package org.vincent;

public class UpperAndLowerCase {
    public static String caseConverter(String inputString){
        char[] inputStringArray = inputString.toCharArray();

        for(int i=0;i<inputStringArray.length;i++){
            if(Character.isUpperCase(inputStringArray[i])){
                inputStringArray[i] = Character.toLowerCase(inputStringArray[i]);
            } else {
                inputStringArray[i] = Character.toUpperCase(inputStringArray[i]);
            }
        }
        return String.valueOf(inputStringArray);
    }
}
