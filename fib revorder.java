class FibonacciTask implements Runnable {
    @Override 
    public void run() {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 +" "+ n2);    
        for (int i = 2; i < 10; ++i) {
            n3 = n1 + n2;    
            System.out.print("  " + n3);
            n1 = n2;
            n2 = n3;
        }  
        System.out.println(); 
    }
}

class ReverseOrderTask implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " "); 
        }
        System.out.println(); 
    }
}

class Main {
    public static void main(String args[]) {
        Thread t1 = new Thread(new FibonacciTask());
        Thread t2 = new Thread(new ReverseOrderTask());   
        
        t1.start();
        t2.start();
    }
}
