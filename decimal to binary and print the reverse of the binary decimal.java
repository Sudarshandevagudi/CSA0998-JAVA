import java.util.Scanner;

class ReverseBinary {
    public static void main(String[] args) 
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a decimal number:");
            int decimal = sc.nextInt();
            if (decimal>0)
            {
                String binary = Integer.toBinaryString(decimal);
    
                String reversedBinary = new StringBuilder(binary).reverse().toString();
        
                int reversedDecimal = Integer.parseInt(reversedBinary, 2);
        
                System.out.println("Reversed Decimal: " + reversedDecimal);
            }
            else
            {
                System.out.println("Invalid input");
                
            }
        }
        catch(Exception e)
        {
            System.out.println("Invalid input");
        }


    }
}
