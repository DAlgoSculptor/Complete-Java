
// To making it Thread class , we have to extends actual Thread


class Thread_A  implements Runnable {
    @Override
    public void run(){
        
        for(int i = 1; i<=10; i++){
            System.out.println("Hii Danish");  
            try { 
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.getLogger(Thread_A.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        

    }
}

class Thread_B  implements Runnable {
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
              System.out.println("Hi Nawaz");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.getLogger(Thread_B.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
    }

}

public class ThreadDemo2 {
    public static void main(String[] args) {

        Runnable A = new Thread_A();
        Runnable B = new Thread_B();

        Thread t1 = new  Thread(A);
        Thread t2 = new Thread(B);

        t1.start();
        
        t2.start();
        
        
    }
}

