import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SortUserInputNames {

    public static void main(String[] args) {
        
        ArrayList<String> namesList = new ArrayList<>(); 

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        System.out.println("Enter names:");
        for(int i=0; i<n; i++) {
           namesList.add(sc.next()); 
        }

        System.out.println("Name list: " + namesList);
        
        System.out.print("Order (A/D): ");
        String order = sc.next().toUpperCase();

        if(order.equals("A")) {
            Collections.sort(namesList);
        } else {
            Collections.sort(namesList, Collections.reverseOrder()); 
        }

        System.out.print("Sorted names: ");
        for(String name : namesList) {
            System.out.print(name + " "); 
        }
    }
}
