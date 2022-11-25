package streamapi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_core {
    public static void main(String[] args) {
        // cach tao 1 emptystream
        Stream<String> streamEmpty= Stream.empty();
        //tao stream tu collection
        Collection<String> collection=Arrays.asList("a","b","c");
        Stream<String> streamOfCollection= collection.stream();
        // stream of array
        Stream<String> streamOfArrays= Stream.of("a","b","c");
        String[] arr= new String[]{"a","b","c"};
        Stream<String> streamArrayfull= Arrays.stream(arr);
        Stream<String> streamArraypart= Arrays.stream(arr,1,3);

        // Stream filter
        Predicate<Integer> p= num -> num%3==0;
        Predicate<Integer> a= num -> num%2==0;
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,12);
        System.out.println(list.stream().filter(p).count()); // dem ra so phan tu chia het cho 3
        list.stream().filter(a).forEach(n -> System.out.println(n));

    }

}
