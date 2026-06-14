
import java.util.Scanner;



public class DemoNewWay {
    public static void main(String[] args) {
        System.out.println("Enter your number" + ":");
        try(Scanner sc = new Scanner(System.in)){ // Try-with-resources
            int num = sc.nextInt();

            System.out.println("your Entered number is " + ":" + num);
        }

        

    }
    
}

