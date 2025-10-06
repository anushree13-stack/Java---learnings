import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Java","Python","C++","SQL","Java");
        Stream<String> stream4=list.stream().distinct();
        stream4.forEach(System.out::println);
    }
    
}
