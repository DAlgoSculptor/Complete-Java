// The Stream API in Java is a feature introduced in Java 8 that allows processing 
// collections of data in a functional and declarative manner.

// The Stream API is used to perform operations such as filtering, mapping, sorting, 
// and reducing on collections of objects without modifying the original data source.


// Note:- Streams can only be used once.


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(1,3,5,7,8,9,10,11,13,14,16,18);

        Stream<Integer> s1 = nums.stream();

        // Finding Even number from the list , using Stream Api method filter
        Stream<Integer> s2 = s1.filter(n -> n % 2 ==0);

        Stream<Integer> s3 = s2.map(n -> n * 2);

        s3.forEach(n -> System.out.println(n));
    }
}
