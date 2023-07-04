package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements05 {
    public static void main(String[] args) {
        double totalPrice = 20000;

        for (int monthCounter = (int) totalPrice; monthCounter >= 1; monthCounter--) {
            double monthlyPrice = totalPrice / monthCounter;

            if (monthlyPrice < 1000) {
                continue;
            }
            System.out.println("Months: " + monthCounter + " Price: " + monthlyPrice);
        }
    }
}
