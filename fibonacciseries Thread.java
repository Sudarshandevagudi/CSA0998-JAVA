class Fibonacci implements Runnable {
    @Override
    public void run() {
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);    //printing 0 and 1    
        
        for(int i=2;i<10;++i) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

class Reverse implements Runnable {
    @Override 
    public void run() {
        for(int i=10; i>0; i--){
            System.out.print(i+" "); 
        }
    }
}

class Main {
    public static void main(String args[]) {
        Fibonacci f = new Fibonacci();
        Thread t1 = new Thread(f);
        
        Reverse r = new Reverse(); 
        Thread t2 = new Thread(r);
        
        t1.start();
        t2.start();
    }
}
