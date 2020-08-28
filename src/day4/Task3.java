package day4;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[][] multiArray = new int[3][4];


        int sumStr = 0;
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = (int) (Math.random() * 5);

                sumStr += multiArray[i][j];

                if (sumStr > maxSum) {
                    maxSum = sumStr;
                    index = multiArray[i][j];
                }

            }
            System.out.println(Arrays.deepToString(multiArray));
        }
        //for (int i = 0; i < multiArray.length; i++) {
            //for (int j = 0; j < multiArray[i].length; j++) {


            //}


            System.out.println("Max sum " + maxSum);
            System.out.println("Max sum index = " + index);
        }

    }

