import java.util.Scanner;
public class AverageMarks {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int Students = 15;
int[] marks = new int[Students];
int totalMarks = 0;
for (int i = 0; i < Students; i++) {
System.out.print("Enter marks for student " + (i+1) + ": ");
marks[i] = scanner.nextInt();
totalMarks += marks[i];
}
float averageMarks = totalMarks / Students;
System.out.println("Total marks: " + totalMarks);
System.out.println("Average marks: " + averageMarks);
}
}
