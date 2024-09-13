import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int k=s.nextInt();
        
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int sum=0,length=0,j=0,maxi=0;
        
        for(int i=0;i<n;i++){
            sum = sum + a[i];
            
            while(sum>k){
                sum = sum - a[j];
                j++;
            }
            length = i-j+1;
            maxi=Math.max(maxi,length);
        }
        System.out.println(maxi);
    }
}
