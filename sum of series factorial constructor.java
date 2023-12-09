import java.util.*;
class Sumofseries
{
protected int n;
protected int i;
private int sum=0;
Sumofseries()
{
System.out.println("Enter a number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
}
void cal()
{
for(i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
class Factorial extends Sumofseries
{
protected int fact=1;
void cal()
{
super.cal();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
class inh
{
public static void main(String args[])
{
Factorial obj=new Factorial();
obj.cal();
}
}
