package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        int number = getNumber.nextInt();

        int countBigger = 0;
        int countSmaller = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        int allElements = 0;

        int[] numbers = new int[number];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);

            if (numbers[i] > 8) {
                countBigger++;
            }
            if(numbers[i] == 1){
                countSmaller++;
            }
            if(numbers[i] % 2 == 0 && numbers[i] != 0){
                evenNumber++;
            }
            if(numbers[i] % 2 != 0){
                oddNumber++;
            }

            allElements = allElements + numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + countBigger);
        System.out.println("Количество чисел равных 1: " + countSmaller);
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        System.out.println("Сумма всех элементов массива: " + allElements);
    }
}
