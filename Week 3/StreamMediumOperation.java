import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamMediumOperation {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,15,20,25,30,35,40);
        Stream<Integer> stream=list.stream().filter(n->n%2==0);
        stream.forEach(System.out::println);
        int sum =list.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
        boolean allpositive=list.stream().allMatch(n-> n > 0);
        System.out.println(allpositive);

    }
}
