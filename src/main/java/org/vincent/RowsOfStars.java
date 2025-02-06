package org.vincent;

public class RowsOfStars {
    public static String starsGenerators(){
        StringBuilder rowOfStars = new StringBuilder();
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                rowOfStars.append("*");
            }
            rowOfStars.append("\n");
        }
        return rowOfStars.toString();
    }
}
