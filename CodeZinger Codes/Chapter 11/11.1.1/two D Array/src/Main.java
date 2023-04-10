import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numRows = s.nextInt();
        int numCols = s.nextInt();

        int[][] array = new int[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                array[row][col] = s.nextInt();
            }
        }
        s.close();

        display2DArray(array);
    }
    private static void display2DArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]);
                if (col != array[row].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}