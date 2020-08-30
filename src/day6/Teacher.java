package day6;

import java.util.Scanner;

public class Teacher {
    private String fullName;
    private String subject;

public Teacher(String fullName, String subject){
    this.fullName = fullName;
    this.subject = subject;
}

public String getFullName(){
    return fullName;
}

public void setFullName(String fullName){
    this.fullName = fullName;
}

public void setSubj(String subject){
    this.subject = subject;
    }

public String getSubject(){
    return subject;
}

public void classStudent(Student student){
        int randomNumber = (int)(Math.random() * 4 + 2);
        String rate = "Оценка студента";
        switch(randomNumber){
            case 2:
                rate = "Неудовлетворительно";
                break;
            case 3:
                rate = "Удовлетворительно";
                break;
            case 4:
                rate = "Хорошо";
                break;
            case 5:
                rate = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + this.fullName + " оценил студента " + student.getFullNameStudent() + " по предмету " + subject + " на оценку " + rate);
    }
}
