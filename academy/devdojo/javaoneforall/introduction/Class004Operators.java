package academy.devdojo.javaoneforall.introduction;

public class Class004Operators {
    public static void main(String[] args) {
        // + - * /
        int numberOne = 10;
        int numberTwo = 20;
        double result = numberOne / (double) numberTwo;

        System.out.println(result);

        // %
        int modulo = 21 % 7;
        System.out.println(modulo);

        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualTwenty = 10 == 20;
        System.out.println("Is Ten Lower Than Twenty: " + isTenLowerThanTwenty);
        System.out.println("Is Ten Greater Than Twenty: " + isTenGreaterThanTwenty);
        System.out.println("Is Ten Lower Or Equals Than Twenty: " + isTenLowerOrEqualsThanTwenty);
        System.out.println("Is Ten Greater Or Equals Than Twenty: " + isTenGreaterOrEqualsThanTwenty);
        System.out.println("Is Ten Different Than Twenty: " + isTenDifferentThanTwenty);
        System.out.println("Is Ten Equal Twenty: " + isTenEqualTwenty);

        // && (AND) || (OR)

        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;

        System.out.println("isLegalOlderThanThirty: " + isLegalOlderThanThirty);
        System.out.println("isLegalYoungerThanThirty: " + isLegalYoungerThanThirty);

        double currentAccount = 299;
        double savingsAccount = 3000;
        float playstationFivePrice = 500;
        boolean canBeBought = currentAccount > playstationFivePrice || savingsAccount > playstationFivePrice;

        System.out.println("canBeBought" + canBeBought);

        // == += -+ *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        // Unary ++ --

        int count = 0;
        count++;
        count--;

        System.out.println(count++);
        System.out.println(count);
    }
}
