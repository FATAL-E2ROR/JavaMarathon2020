package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        int countZero = 0;
        int sum = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10000);

            if(numbers[i] % 10 == 0){
                countZero++;
                sum = sum + numbers[i];
            }

            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < numbers[min]){
                min = i;
            }

        }
        //System.out.print(Arrays.toString(numbers));


        System.out.println("Количество элементов массива, оканчивающихся на 0: " + countZero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
        System.out.println("Наименьший элемент массива: " + max);
        System.out.println("Min = " + numbers[min]);
    }
}
