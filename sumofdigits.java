import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num,sum=0;
        
        System.out.println("enter the n values : ");
        int n=s.nextInt();
        
        System.out.println("enter the number : ");
        num=s.nextInt();
        
        while(num > 0){
            int digit = num % 10;
            
            sum = sum+digit;
            
            num = num/10;
        }
        System.out.println("Sum of Digits: "+sum);  
    }
}
