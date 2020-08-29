package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setYear(1996);
        car1.setColor("White");
        car1.setModel("Jiguli");

        System.out.println("Год выпуска автомобиля: " + car1.getYear());
        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Модель автомобиля: " + car1.getModel());
        }
    }
