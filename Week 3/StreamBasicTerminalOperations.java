import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasicTerminalOperations {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        List<String> words=Arrays.asList("Apple", "Banana", "Avocado", "Mango");
        Stream<Integer> stream=list.stream();
        list.stream().forEach(System.out::println);
        Stream<String> stream2=words.stream().filter(s->s.charAt(0)=='A');
        long count=stream.count();
        System.out.println(count);
        //stream.forEach(System.out::println);
        stream2.forEach(System.out::println);



    }
}
