package day7;

public class Task1 {
    public static void main(String[] args) {
        Plane airplane1 = new Plane("Java AirLines", 2020, 40, 170);
        Plane airplane2 = new Plane("Boeng 747", 2010, 60, 220);
        Plane.equalPlanes(airplane1, airplane2);
    }
}
