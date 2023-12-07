class Main {
    public static void main(String[] args) {

        // Print upper half  
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        // Print lower half
        for(int i=3; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
