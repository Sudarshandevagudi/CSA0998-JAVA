import java.util.Scanner;

public class main{
public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  int n = s.nextInt();
  String bin = "";
  while(n != 0){
    bin = (n & 1) + bin;
    n = n >> 1;
  }
bin = bin.replaceAll("1","2");
bin = bin.replaceAll("0","1");
bin = bin.replaceAll("2","0");
  int result = Integer.parseInt(bin,2);
  System.out.println(result);
}
}
