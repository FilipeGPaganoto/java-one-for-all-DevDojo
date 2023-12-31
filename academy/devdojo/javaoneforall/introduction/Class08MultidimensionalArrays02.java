package academy.devdojo.javaoneforall.introduction;

public class Class08MultidimensionalArrays02 {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        int[] numbers = {1, 2, 3};

        array[0] = new int[]{1, 2, 3};
        array[1] = numbers;
        array[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayTwo = {{1, 2}, {1, 2, 3}, {1, 2, 3 ,4 ,5, 6}};
        for (int[] baseArray : arrayTwo) {
            System.out.println("\n------");
            for (int num : baseArray) {
                System.out.print(num + " ");
            }
        }
    }
}
