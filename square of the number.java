import java.util.Scanner;
public class NumberAndSquareArray
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the lower range: ");
int l = scanner.nextInt();
System.out.print("Enter the upper range: ");
int u = scanner.nextInt();
if (l <= u)
{
int size = u - l + 1;
int[][] numsq = new int[size][2];
for (int i = 0; i < size; i++)
{
int num = l + i;
numsq[i][0] = num;
numsq[i][1] = num * num;
}
System.out.print("[");
for (int i = 0; i < size; i++)
{
System.out.print("(" + numsq[i][0] + ", " + numsq[i][1] + ")");
if (i < size - 1) {
System.out.print(", ");
}
}
System.out.println("]");
}
else
{
System.out.println("Invalid input: Lower range should be less than or equal to upper range.");
}
}
}
