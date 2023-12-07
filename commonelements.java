import java.util.ArrayList;
import java.util.Scanner;

public class CommonElementsUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt(); 
        
        int arr1[] = new int[size1];
        System.out.print("Enter elements of first array: ");
        for(int i=0; i<size1; i++) {
            arr1[i] = scanner.nextInt(); 
        }
        
        System.out.print("Enter size of second array: "); 
        int size2 = scanner.nextInt();
        
        int arr2[] = new int[size2];
        System.out.print("Enter elements of second array: ");
        for(int i=0; i<size2; i++) {
            arr2[i] = scanner.nextInt();
        }
              
        ArrayList<Integer> common = new ArrayList<>();
        
        for (int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    common.add(arr1[i]); 
                }
            }
        }
        
        System.out.print("Common Elements: ");
        for(int i: common) {
            System.out.print(i + " "); 
        }
    } 
}
