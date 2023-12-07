import java.util.Scanner;

class NumberSquareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the lower range: ");
        int low = sc.nextInt();
        
        System.out.print("Enter the upper range: ");
        int high = sc.nextInt();
        
        int range = high - low + 1;
        
        int[][] arr = new int[range][2];
        
        int index = 0;
        for(int i=low; i<=high; i++) {
            arr[index][0] = i; 
            arr[index][1] = i*i;
            index++;
        }
        
        System.out.print("Sample Output: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print("[" + arr[i][0] + ", " + arr[i][1] + "], ");
        }
        
    }
}
