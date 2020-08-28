package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int sum = 0;
        int maxSum = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 10000);

            
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("sum " + sum);
    }
}
