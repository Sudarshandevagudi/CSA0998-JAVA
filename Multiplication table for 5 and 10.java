class MultiplicationTask implements Runnable {

    private int number;
    
    public MultiplicationTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Multiplication table of " + number); 
        for(int i=1; i<=10; i++) {
            System.out.println(number + " X " + i + " = " + (number*i)); 
        }
    }
}

class Main {

    public static void main(String[] args) {
        
        Runnable task1 = new MultiplicationTask(5); 
        Runnable task2 = new MultiplicationTask(10);

        Thread thread1 = new Thread(task1);  
        Thread thread2 = new Thread(task2);

        thread1.start();   
        thread2.start();

         
    }
}
