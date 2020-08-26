package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner getNumbers = new Scanner(System.in);

        int counter = 0;
            while(counter < 5){
                double firstNumber = getNumbers.nextDouble();
                double secondNumber = getNumbers.nextDouble();

                double result = firstNumber / secondNumber;
                    if(secondNumber == 0) {
                        System.out.println("Деление на 0");
                        continue;
                    }
                System.out.println(result);
                counter++;
            }
        }
    }