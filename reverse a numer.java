import java.util.*;
class reverseNum
{
public static void main(String args[])
{
try
{
int num,rem,result=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
num=sc.nextInt();
while(num!=0)
{
rem=num%10;
result=result*10+rem;
num=num/10;
}
System.out.println("reverse number is:"+result);
}
catch(Exception e)
{
System.out.println("Please! Enter a valid number");
}
}
}
