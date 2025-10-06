import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("JAVA","PYTHON","R PROGRAMMING","C++","SQL LANGUAGE","R PROGRAMMING");
        Stream<String> stream1=list.stream().distinct().filter(s->s.length()>3).map(String::toLowerCase).sorted();
        stream1.forEach(System.out::println);

    }
}
