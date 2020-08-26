package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner getNumbers = new Scanner(System.in);

        while(true){
        double firstNumber = getNumbers.nextDouble();
        double secondNumber = getNumbers.nextDouble();

        double result;

        if(secondNumber == 0)
            break;
        result = firstNumber / secondNumber;
        System.out.println(result);
            continue;
        }
    }
}
