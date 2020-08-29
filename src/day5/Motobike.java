package day5;

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
}


