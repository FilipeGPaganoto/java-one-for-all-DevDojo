package academy.devdojo.javaoneforall.introduction;

public class Class002PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, boolean, char, byte, short, long

        int age = (int) 100000000000L;
        long bigNumber = (long) 10000.55;
        float salaryFloat = (float) 2500.0D;
        double salaryDouble = 5000;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 29;
        byte ageByte = -128;
        char character = 70;
        String name = "Filipe";

        System.out.println("The age is: " + age + " years old");
        System.out.println(character);
        System.out.println(salaryFloat);
        System.out.println(bigNumber);
        System.out.println("Hi!, I am " + name);
    }
}
