import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoCollection {
    public static void main(String[] args){

        // Collection Interface

        // List<Integer> nums = new ArrayList<>();

        Collection<Integer> nums = new TreeSet<> ();

        nums.add(1);
        nums.add(2);
        nums.add(9);
        nums.add(10);
        nums.add(12);
        nums.add(20);
        nums.add(30);

        // for loop
        // for (int i = 0; i<nums.size(); i++) {

        //     System.out.println(nums.get(i));
        // }

        // for each loop 
        

        // for(int n : nums){
        //     System.out.print(n + " ");
        // }


        // Using Iterable Method

        Iterator<Integer> values= nums.iterator();
        
        while(values.hasNext())
            System.out.println(values.next());

        


    }
}