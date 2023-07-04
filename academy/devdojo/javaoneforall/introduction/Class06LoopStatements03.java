package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements03 {
    public static void main(String[] args) {
        int counter = 50;

        for (int i = 0; i < counter; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Outside For");
    }
}
