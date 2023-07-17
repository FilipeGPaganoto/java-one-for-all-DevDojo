package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Gnar";

        System.out.println(student01.name);
        System.out.println(student01.age);
        System.out.println(student01.gender);

        System.out.println("----------------");

        System.out.println(student02.name);
        System.out.println(student02.age);
        System.out.println(student02.gender);

    }
}
