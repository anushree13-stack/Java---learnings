import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterWithMap {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("bluor","blue","blood","astronomy","park");
        Stream<String> stream1=list.stream().filter(s->s.charAt(0)==('b')).map(String::toUpperCase);
        stream1.forEach(System.out::println);


    }
}
