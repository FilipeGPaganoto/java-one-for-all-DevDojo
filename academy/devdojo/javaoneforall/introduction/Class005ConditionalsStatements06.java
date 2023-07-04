package academy.devdojo.javaoneforall.introduction;

public class Class005ConditionalsStatements06 {
    public static void main(String[] args) {
        byte day = 7;

        switch (day) {
            case 2,3,4,5,6 :
                System.out.println("Business day! Let's go to work!");
                break;
            case 1,7 :
                System.out.println("Weekend! Let's rest!");
                break;
            default:
                System.out.println("Are you living in outer planet??");
                break;
        }
    }
}
