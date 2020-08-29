package day5;

public class Task2 {
    public static void main(String[] args) {
        Motobike bike1 = new Motobike(2019, "Red", "Kavasaki");

        System.out.println("Год выпуска мотоцикла: " + bike1.getYear());
        System.out.println("Цвет мотоцикла: " + bike1.getColor());
        System.out.println("Модель мотоцикла: " + bike1.getModel());
    }
}
