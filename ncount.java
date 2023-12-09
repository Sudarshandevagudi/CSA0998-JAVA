import java.util.Scanner;
public class CharacterCount {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int upperCount = 0;
int lowerCount = 0;
int numberCount = 0;
char input;
System.out.println("Enter * to exit...");
do {
System.out.print("Enter any character: ");
input = scanner.next().charAt(0);
if (Character.isUpperCase(input)) {
upperCount++;
} else if (Character.isLowerCase(input)) {
lowerCount++;
} else if (Character.isDigit(input)) {
numberCount++;
}
} while (input != '*');
System.out.println("Total count of lower case: " + lowerCount);
System.out.println("Total count of upper case: " + upperCount);
System.out.println("Total count of numbers: " + numberCount);
}
}
