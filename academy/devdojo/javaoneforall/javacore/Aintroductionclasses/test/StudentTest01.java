package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Student;

public class StudentTest01 {
    static final String login = "Sim";
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Aatrox";
        student.age = 10;
        student.gender = 'M';
    }
}
