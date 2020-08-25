package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числa a и b через пробел: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int counter = a + 1;
        while(counter < b){
            counter++;
            if(counter % 5 == 0 && counter % 10 != 0){
                System.out.print(counter + " ");
            }
        }
    }
}
