import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoTraditionalWay {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter your number:");

        InputStreamReader in = new InputStreamReader(System.in);
        try(BufferedReader bf = new BufferedReader(in)){   // Try-with-resources
            int num = Integer.parseInt(bf.readLine());

            System.out.println(num);
        }

        

      
    }
}