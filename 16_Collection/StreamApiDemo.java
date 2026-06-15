
import java.util.Arrays;
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        

        List<Integer> nums = Arrays.asList(10, 22, 9, 5, 7, 4,8);

        int sum = 0;
        for(Integer n : nums){
            if(n % 2 == 0){
                n = n * 2;
                sum = sum + n;
            }
        }
        System.out.println(sum);

        // System.out.println(nums);

    }
}
