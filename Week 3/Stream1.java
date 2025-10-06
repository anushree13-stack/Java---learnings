import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Java","Python","C++");
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);
    }
}
