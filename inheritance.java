class SuperClass {
int value;
int value1;
SuperClass(int value) {
this.value = value;
}
void display() {
System.out.println(value);
}
}
class Superclass extends SuperClass {
Superclass(int value, int value1) {
super(value);
this.value1 = value1;
}
void display() {
super.display();
System.out.println(value1);
}
}
class Main {
public static void main(String[] args) {
Superclass obj1 = new Superclass(100, 200);
obj1.display();
}
}
