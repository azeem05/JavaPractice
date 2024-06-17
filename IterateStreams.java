import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
public class IterateStreams {
    public static void main(String[] args){
        Stream<Integer> evenNumStream = Stream.iterate(2, i -> i * 2);

        List<Integer> collect = evenNumStream
                .limit(5)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
