
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachUsingCosumerInterface {
    public static void main(String[] args){
    


        List<Integer> nums = Arrays.asList(10,29,39,40,3,5);

        Consumer<Integer> con = (n) -> System.out.println(n); // Lambda Expression.
    
        nums.forEach(con);
    }
}
