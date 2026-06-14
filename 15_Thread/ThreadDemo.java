
// To making it Thread class , we have to extends actual Thread


class Thread_A  extends Thread {
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

class Thread_B  extends Thread {
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

public class ThreadDemo {
    public static void main(String[] args) {

        Thread_A A = new Thread_A();
        Thread_B B = new Thread_B();

        try {
            A.start();
            Thread.sleep(5);
        } catch (InterruptedException e) {
        }
        try {
            B.start();
            Thread.sleep(5);
        } catch (InterruptedException e) {
        }
        
    }
}

