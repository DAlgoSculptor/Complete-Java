
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {

        Comparator<Integer> Com = new Comparator<Integer>() {

            @Override
            public int compare(Integer i , Integer j){
                if(i % 10 > j % 10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };


        // Using Lambda Expression

        // Comparator<Integer> Com = (i , j) -> {
        //     if(i % 10 > j % 10){
        //         return 1;
        //     }else{
        //         return -1;
        //     }
            
        // };



        List<Integer> nums = new ArrayList<>();


        nums.add(10);
        nums.add(29);
        nums.add(28);
        nums.add(33);
        nums.add(27);

        Collections.sort(nums, Com);

        System.out.println(nums);
        
    }
}
