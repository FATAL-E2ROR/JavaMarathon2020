package day6;

public class Plane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private double fuelVolume;

    public Plane(){
        this.manufacturer = "Java";
        this.year = 2015;
        this.length = 80.4;
        this.weight = 180;
        this.fuelVolume = 0;
    }

    public Plane(String setManufacturer, int setYear, double setLength, double setWeight, double setFuelVolume){
        this.manufacturer = setManufacturer;
        this.year = setYear;
        this.length = setLength;
        this.weight = setWeight;
        this.fuelVolume = 0;
    }

    public void setLength(double lengthPlane){
        if(lengthPlane <= 0){
            System.out.println("Некорректный ввод!");
        } else {
            length = lengthPlane;}
    }

    public double getLength(){
        return length;
    }

    public void setYear(int yearPlane){
        if(yearPlane == 0 || yearPlane > 2020){
            System.out.println("Некорректный ввод!");
        } else {
            year = yearPlane;}
    }

    public int getYear(){
        return year;
    }

    void info(){
        System.out.println("Изготовитель: " + manufacturer + ", " +
                           "Год выпуска: " + getYear() + " год, " +
                           "Длина: " + getLength() + " метров, " +
                           "Вес: " + weight + " тонны, " +
                           "Объём топлива в баке: " + fuelVolume + " литров"
                        );
    }

    void fillUp(double fuel){
        this.fuelVolume = fuel;
    }
}
