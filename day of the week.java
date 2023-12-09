import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
class DayOfWeekFinder
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the day:");
int day = sc.nextInt();
System.out.println("Enter the month:");
int month = sc.nextInt();
System.out.println("Enter the year:");
int year = sc.nextInt();
if(year>1971 && year<2100)
{
LocalDate date = LocalDate.of(year, month, day);
DayOfWeek dayOfWeek = date.getDayOfWeek();
System.out.println("The day of the week is: " + dayOfWeek);
}
else
{
System.out.println("Invalid date. Please enter a valid date.");
}
}
}
