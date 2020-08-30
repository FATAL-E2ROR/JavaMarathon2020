package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Java Airbus", 2015, 70.4, 162.4, 0);

        plane1.setYear(1996);
        plane1.setLength(85);

        plane1.fillUp(140);
        plane1.fillUp(700);

        plane1.info();
    }
}
