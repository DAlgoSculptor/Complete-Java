public class throw_Exception {
    
    public static void main(String[] args) {

        int a = 20;

        int b = 1;
        
        try{
            b = 10/a;
            if(b==0){
                System.out.println("Inside if block");
                throw new ArithmeticException();
        }
        }catch(ArithmeticException e){
            System.out.println("Cannot divided by zero! ");
        }
          System.out.println(b);
 
    }
  
}



