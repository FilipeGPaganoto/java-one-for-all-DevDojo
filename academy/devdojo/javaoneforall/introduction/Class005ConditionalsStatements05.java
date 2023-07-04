package academy.devdojo.javaoneforall.introduction;

public class Class005ConditionalsStatements05 {
    public static void main(String[] args) {
        byte day = 1;
        String dayOfWeek;

        switch (day) {
            case 1:
                dayOfWeek = "Sunday";
                System.out.println(dayOfWeek);
                break;
            case 2:
                dayOfWeek = "Monday";
                System.out.println(dayOfWeek);
                break;
            case 3:
                dayOfWeek = "Tuesday";
                System.out.println(dayOfWeek);
                break;
            case 4:
                dayOfWeek = "Wednesday";
                System.out.println(dayOfWeek);
                break;
            case 5:
                dayOfWeek = "Thursday";
                System.out.println(dayOfWeek);
                break;
            case 6:
                dayOfWeek = "Friday";
                System.out.println(dayOfWeek);
                break;
            case 7:
                dayOfWeek = "Saturday";
                System.out.println(dayOfWeek);
                break;
            default:
                System.out.println("Not a valid number!");
                break;
        }

        char gender = 'M';

        switch (gender) {
            case 'M' :
                System.out.println("Male");
                break;
            case 'F' :
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
