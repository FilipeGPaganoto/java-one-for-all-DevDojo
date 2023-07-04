package academy.devdojo.javaoneforall.introduction;

public class Class005ConditionalsStatements03 {
    public static void main(String[] args) {
        // if salary > 2000 "Can buy" "Can't buy"
        double salary = 3500D;
        String shouldBuyMessage = "Buy PS5!";
        String shouldNotBuyMessage = "Don't buy PS5!";
        // (condition) ? <true> : <false>
        String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;
        boolean shouldIBuy = salary > 2000;

        System.out.println(displayMessage);
    }
}
