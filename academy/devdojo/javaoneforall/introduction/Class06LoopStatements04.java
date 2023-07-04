package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements04 {
    public static void main(String[] args) {
        double carPrice = 20000;

        for (int monthCount = 1; monthCount < 20000; monthCount++) {
            double monthlyPrice = carPrice / monthCount;

            if (monthlyPrice < 1000) {
                break;
            }

            System.out.println("Months: " + monthCount + " Price: " + monthlyPrice);
        }
    }
}
