package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("James Gosling", "Computer Science");Teacher teacher2 = new Teacher("Наиль Алишев", "Java programming");

        Student student1 = new Student("Herbert Shildt");

        teacher1.classStudent(student1);
    }
}
