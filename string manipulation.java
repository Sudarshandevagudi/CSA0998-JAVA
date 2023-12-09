class test
{
String string1;
String string2;
String string3;
String s1;
String s2;
String s3;
String s4;
String s5;
int s6;
int s7;
boolean s8;
boolean s9;
char s10;
int s11;
void input()
{
string1 = "I Love java";
string2="JAVA";
string3="java";
s1=string1.toLowerCase();
s2=string1.toUpperCase();
s3=string1.replace("o","i");
s4=string1.substring(2);
s5=string1.substring(2,6);
s6=string1.indexOf("L");
s7=string1.length();
s8=string2.equals(string3);
s9=string2.equalsIgnoreCase(string3);
s10=string1.charAt(5);
s11=string2.compareTo(string3);
}
P ROHITH KUMAR
void disp()
{
System.out.println(s1);//print s1 as i love java
System.out.println(s2); // print s1 has I LOVE JAVA
System.out.println(s3); //print I Live java
System.out.println(s4); //Display Love java
System.out.println(s5); // Display Love
System.out.println(s6); // Find the position of L in s1
System.out.println(s7);
System.out.println(s8);
System.out.println(s9);
System.out.println(s10);
System.out.println(s11);
}
public static void main(String args[])
{
test obj = new test();
obj.input();
obj.disp();
}
}
