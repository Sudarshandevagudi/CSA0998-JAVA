import java.util.Arrays;
import java.util.Scanner;
public class m2 {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements in the array:");
int length = sc.nextInt();
int[] arr = new int[length];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < length; i++)
{
arr[i] = sc.nextInt();
}
System.out.println("Enter the value of M:");
int m = sc.nextInt();
System.out.println("Enter the value of N:");
int n = sc.nextInt();
if (m <= 0 || m > length || n <= 0 || n > length)
{
System.out.println("Invalid values for M and N. They should be between 1 and the length of the array.");
}
else
{
Arrays.sort(arr);
int mthMax = arr[length - m];
int nthMin = arr[n - 1];
int sum = mthMax + nthMin;
int diff = mthMax - nthMin;
System.out.println("Mth Maximum Number = " + mthMax);
System.out.println("Nth Minimum Number = " + nthMin);
System.out.println("Sum = " + sum);
System.out.println("Difference = " + diff);
}
}
}
