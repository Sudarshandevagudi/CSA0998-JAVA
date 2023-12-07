import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt(); 
        }
        
        System.out.print("Array with duplicates: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" "); 
        }

        int[] temp = new int[n];  
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
         }
        temp[j++] = arr[n-1];     

        System.out.println("\nNon-duplicate items: ");    
        for (int i=0; i<j; i++) {
           System.out.print(temp[i]+" ");
        }
    }
}
