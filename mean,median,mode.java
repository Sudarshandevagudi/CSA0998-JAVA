import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take size of array input
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        // Take array elements input
        int[] elements = new int[size]; 
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++) {
            elements[i] = sc.nextInt(); 
        }
        
        // Sort the array
        Arrays.sort(elements);
        
        // Mean 
        int sum = 0;
        for(int element : elements) {
            sum += element;
        }
        double mean = (double)sum / elements.length;

        // Median
        int median;
        if(elements.length % 2 == 0) {
            median = (elements[elements.length/2] + elements[elements.length/2 - 1]) / 2; 
        } else {
            median = elements[elements.length/2]; 
        }
        
        // Mode 
        int mode = elements[0];
        int maxCount = 1;
        int currCount = 1;
        for(int i=1; i< elements.length; i++) {
            if(elements[i] == elements[i-1]) {
                currCount++;
            }else {
                if(currCount > maxCount) {
                    maxCount = currCount;
                    mode = elements[i-1];
                }
                currCount = 1; 
            }
        }
        
        // Print output
        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode); 
        
        sc.close();
    }
}
