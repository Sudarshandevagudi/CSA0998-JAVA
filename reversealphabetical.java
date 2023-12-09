import java.util.Scanner;
class ReverseAlphabetical {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the word:");
String word = sc.nextLine();
char[] charArray = word.toCharArray();
for (int i = 0; i < charArray.length - 1; i++) {
for (int j = i + 1; j < charArray.length; j++) {
if (charArray[i] < charArray[j]) {
char temp = charArray[i];
charArray[i] = charArray[j];
charArray[j] = temp;
}
}
}
StringBuilder reversedOrder = new StringBuilder();
for (char ch : charArray) {
reversedOrder.append(ch).append(" ");
}
System.out.println("Alphabetical Order: " + reversedOrder.toString().trim());
sc.close();
}
}
