package academy.devdojo.javaoneforall.introduction;

public class Class07Arrays03 {
    public static void main(String[] args) {
        int[] numbersOne = new int[3];
        int[] numbersTwo = {1, 2, 3, 4, 5};
        int[] numbersThree = new int[]{5, 4, 3, 2, 1};

//        for (int i = 0; i < numbersThree.length; i++) {
//            System.out.println(numbersThree[i]);
//        }

        for (int num : numbersTwo) {
            System.out.println(num);
        }
    }
}
