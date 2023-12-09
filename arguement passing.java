class test
{
protected int a;
void add(int a)
{
System.out.println(a);
}
}
class addition extends test
{
protected int b;
void add(int a,int b)
{
this.a=a;
this.b=b;
super.add(a);
int c = a + b;
System.out.println(c);
}
}
class inh
{
public static void main(String args[])
{
addition obj = new addition();
obj.add(2, 3);
}
}
