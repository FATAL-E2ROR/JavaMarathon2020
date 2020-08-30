package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motobike bike1 = new Motobike();

        car1.speak();
        car1.setYear(1996);
        car1.getOtherYear();

        bike1.speak();
        bike1.getOtherYear();
    }
}
