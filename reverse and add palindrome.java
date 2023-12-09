import java.util.Scanner;

class ReverseAndAddPalindrome {

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverseNumber(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");

        // Validate if the input is an integer
        if (scanner.hasNextInt()) {
            int inputNumber = scanner.nextInt();

            // Check if the input is non-negative
            if (inputNumber >= 0) {
                int originalNumber = inputNumber;

                // Keep reversing and adding until a palindrome is obtained
                while (!isPalindrome(inputNumber)) {
                    int reversedNumber = reverseNumber(inputNumber);
                    inputNumber += reversedNumber;
                    System.out.println(originalNumber + " + " + reversedNumber + " = " + inputNumber);
                }

                System.out.println("Palindrome obtained: " + inputNumber);
            } else {
                System.out.println("Please enter a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
