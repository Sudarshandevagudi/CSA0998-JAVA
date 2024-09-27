import java.util.Scanner;

public class main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String str=s.next();
    int n=s.nextInt();
    String arr[] = {"mon","tue","wed","thu","fri","sat","sun"};
    int i=0;
    for(i=0;i<arr.length;i++)
      if(arr[i].equals(str))
        break;
    int result = 1;
    int rem = 6 - i;
    n = n - rem;
    result = result + n/7; //result += n/7;
    if(n>0)
      System.out.println(""+result);
  }
}
