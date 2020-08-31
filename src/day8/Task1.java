package day8;

public class Task1 {
    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        String numbers = "";
        for(int i = 0; i < 20001; i++){
            System.out.println(numbers + i +" ");
            }
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for(int j = 0; j < 20001; j++){
            System.out.println(sb.toString() + j + " ");
        }
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;

        System.out.println("Время выполнения программы без StringBuilder: " + timeConsumedMillis1 + " ms");
        System.out.println("Время выполнения программы со StringBuilder: " + timeConsumedMillis2 + " ms");
    }
}
