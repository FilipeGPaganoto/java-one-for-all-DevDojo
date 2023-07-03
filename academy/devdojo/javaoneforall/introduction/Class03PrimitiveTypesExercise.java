package academy.devdojo.javaoneforall.introduction;

public class Class03PrimitiveTypesExercise {
    public static void main(String[] args) {
        String name = "Filipe";
        String address = "Rua M##";
        double salary = 5343.99;
        String receivedSalaryDate = "03/06/2023"; // dd/MM/yyyy

        String report = ("I " + name + ", living at " + address + ", confirm that I received the salary of " + salary + " on " + receivedSalaryDate);

        System.out.println(report);
    }
}
