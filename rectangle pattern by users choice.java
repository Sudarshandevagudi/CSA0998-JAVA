import java.io.*;
import java.util.*;
class rectpat
{
public static void main(String[] args)
{
int i,j,m,n;
char c;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number.of.rows:");
m=sc.nextInt();
System.out.print("Enter the number.of.columns:");
n=sc.nextInt();
System.out.print("Enter the symbol:");
c=sc.next().charAt(0);
for (i=0; i<m; i++)
{
for (j=0; j<n; j++)
{
System.out.print(c);
}
System.out.println();
}
}
}
