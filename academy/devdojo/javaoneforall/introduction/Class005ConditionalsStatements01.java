package academy.devdojo.javaoneforall.introduction;

public class Class005ConditionalsStatements01 {
    public static void main(String[] args) {
        int age = 19;
        boolean isAllowedToBuyAlcohol = age >= 18;

        if (isAllowedToBuyAlcohol) {
            System.out.println("Authorized to buy alcohol");
        } else {
            System.out.println("You're not authorized yet, be patient");
        }
        // !

        if (!(isAllowedToBuyAlcohol)) {
            System.out.println("Sorry, you are not allowed to buy alcohol!");
        }

        boolean c = true;
        if (!c) {
            System.out.println("Inside weird condition");
        }
        System.out.println("Outside IF");
    }
}
