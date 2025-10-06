import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,2,23,302,100,3423,33);
        Stream<Integer> stream1=list.stream().map(n->n*3);
        long count = list.stream().count();
        stream1.forEach(System.out::println);
        System.out.println(count);

    }
}
