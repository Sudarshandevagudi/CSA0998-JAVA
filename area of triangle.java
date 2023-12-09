import java.util.*;
class Triangle
{
int base,height;
void area()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the base of triangle: ");
base=s.nextInt();
System.out.println("Enter the height of triangle: ");
height=s.nextInt();
}
void cal()
{
int result=base*height*1/2;
System.out.println("Area of triangle= "+result);
}
public static void main(String[] arg)
{
Triangle obj=new Triangle();
obj.area();
obj.cal();
}
}
