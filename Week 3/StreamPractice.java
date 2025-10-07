import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,78,100,100,100,45);
        List<String> words =Arrays.asList("Rishi","Kesh","Arjun","karan");
        Stream<String> stream2 = words.stream().map(String::toUpperCase);
        Stream<Integer> stream1=list.stream().filter(n->n>5).distinct().skip(1).sorted();
        int sum=list.stream().reduce(0,(a,b)-> a+b);
      //  long count=list.stream1().count();
        System.out.println(sum);
        stream1.forEach(System.out::println);
         stream2.forEach(System.out::println);

    }
}