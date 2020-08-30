package day6;

import java.util.Scanner;

class Motobike {
    private int yearOfIssue;
    private String bikeColor;
    private String bikeModel;

    public Motobike(){
        this.yearOfIssue = 2010;
        this.bikeColor = "Black";
        this.bikeModel = "Yamaha R1";
    }

    public Motobike(int year, String color, String model){
        this.yearOfIssue = year;
        this.bikeColor = color;
        this.bikeModel = model;
    }

    public int getYear(){
        return yearOfIssue;
    }

    public String getColor(){
        return bikeColor;
    }

    public String getModel(){
        return bikeModel;
    }

    void speak(){
        System.out.println("Это мотоцикл");
    }

    void getOtherYear(){
        Scanner getNumber = new Scanner(System.in);
        int yearBike = getNumber.nextInt();
        System.out.println("Введите год");
        int difference = yearBike - getYear();
        if(difference < 0) {
            difference = -difference;
        }
        System.out.println("Разница в годах равна: " + difference + " лет");
    }
}


