import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print inverted pyramid
        printInvertedPyramid(rows);
    }

    static void printInvertedPyramid(int rows) {
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
