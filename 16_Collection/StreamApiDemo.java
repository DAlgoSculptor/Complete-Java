
import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        

        List<Integer> nums = Arrays.asList(10, 22, 9, 5, 7, 4,8);

        for(Integer n : nums){
            if(n % 2 == 0){
               System.out.print(n + " ");
            }
        }
        System.out.println();

        // System.out.println(nums);


        // using Stream Api

        nums.forEach(n -> System.out.println(n));

    }
}
