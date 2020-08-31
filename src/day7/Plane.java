package day7;

public class Plane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private int fuelVolume;

    public Plane(String manufacturer, int year, double length, double weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuelVolume = 0;
    }

    public double getLength(){
        return length;
    }

    public void setLength() {
        this.length = length;
    }

    public void setYear(int yearPlane){
        if(yearPlane == 0 || yearPlane > 2020){
            System.out.println("Некорректный ввод!");
        } else {
            year = yearPlane;}
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void setYear() {
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public double getWeight() {
        return weight;
    }
    public void setweight() {
        this.weight = weight;
    }
    public int getFuelVolume() {
        return fuelVolume;
    }
    public void setFiel() {
        this.fuelVolume = fuelVolume;
    }

    void fillUp(int inputFuel){
        this.fuelVolume = fuelVolume + inputFuel;
    }

    public static void equalPlanes(Plane airplane1, Plane airplane2){
        if(airplane1.length > airplane2.length){
            System.out.println(airplane1.manufacturer + " длиннее " + airplane2.manufacturer);
        } else if (airplane1.length < airplane2.length){
            System.out.println(airplane2.manufacturer + " длиннее " + airplane1.manufacturer);
        } else {
            System.out.println("Длинна самолётов одинакова");
        }
    }
}
