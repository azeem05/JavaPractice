import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {
    public static void main(String[] args){
        List<Integer> list = IntStream.of(0,1,2,2,3,3,3,4,5).boxed().toList();
        List<Integer> resultantDuplicates=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Duplicates approach 1");
        resultantDuplicates.forEach(System.out::println);
        System.out.println("Duplicates approach 2");
        list.stream().filter(n -> list.stream().filter(i->i==n).count() > 1).distinct().forEach(System.out::println);
    }
}