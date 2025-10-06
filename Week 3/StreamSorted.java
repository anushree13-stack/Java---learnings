import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,4,5,6,7,8,41,34);
        Stream<Integer> stream3=list.stream().distinct().sorted();
        stream3.forEach(System.out::println);
    }
}
