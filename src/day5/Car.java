package day5;

class Car {
    private int yearOfIssue;
    private String carColor;
    private String carModel;

    public void setYear(int Year){
        if(Year == 0 || yearOfIssue > 2020){
            System.out.println("Некорректный ввод!");
        } else {
         yearOfIssue = Year;}
    }
    public int getYear(){
        return yearOfIssue;
    }

    public void setColor(String color){
        if (color.isEmpty()){
            System.out.println("Вы ввели пустую строку!");
        } else {
        carColor = color;}
    }
    public String getColor(){
        return carColor;
    }

    public void setModel(String model){
        if (model.isEmpty()){
            System.out.println("Вы ввели пустую строку!");
        } else {
            carModel = model;}
    }
    public String getModel(){
        return carModel;
    }
}
