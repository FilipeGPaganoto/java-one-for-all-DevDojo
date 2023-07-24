package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int n1 = 1;
        int n2 = 2;

        calculator.changeTwoNumbers(n1, n2);
        System.out.println("Inside CalculatorTest04");
        System.out.println("Number One : " + n1);
        System.out.println("Number Two : " + n2);
    }
}
