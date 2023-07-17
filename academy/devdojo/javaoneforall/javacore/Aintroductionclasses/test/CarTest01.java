package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car();

        car01.name = "Audi";
        car01.model = "A3";
        car01.year = 2023;

        car02.name = "Fiat";
        car02.model = "Uno";
        car02.year = 2006;

        car01 = car02;

        System.out.println("Car 1\n");

        System.out.println(car01.name);
        System.out.println(car01.model);
        System.out.println(car01.year);

        System.out.println("\nCar 2\n");

        System.out.println(car02.name);
        System.out.println(car02.model);
        System.out.println(car02.year);
    }
}
