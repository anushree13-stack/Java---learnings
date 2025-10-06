import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLength {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("ANU","Pritha","Fawad","tvishaaa");
        Stream<String> stream5=list.stream().filter(s->s.length()>3);
        stream5.forEach(System.out::println);


        
    }
}
