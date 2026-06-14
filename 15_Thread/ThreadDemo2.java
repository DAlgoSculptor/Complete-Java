
// To making it Thread class , we have to extends actual Thread
// Using Annonymous class 
class Thread_B  implements Runnable {
    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    public void run(){
        for(int i=1; i<=10; i++){
              System.out.println("Hi Nawaz");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }

}

public class ThreadDemo2 {
    public static void main(String[] args) {

        @SuppressWarnings("CallToPrintStackTrace")
        Runnable A = () -> {
            for(int i = 1; i<=10; i++){
                System.out.println("Hii Danish");
                try { 
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        };
        Runnable B = new Thread_B();

        Thread t1 = new  Thread(A);
        Thread t2 = new Thread(B);

        t1.start();
        
        t2.start();
        
        
    }
}

