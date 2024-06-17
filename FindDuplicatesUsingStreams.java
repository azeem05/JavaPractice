import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicatesUsingStreams {
    public static void main(String[] args){
        List<Integer> list = IntStream.of(0,1,2,2,3,3,3,4,5).boxed().collect(Collectors.toList());
        List<Integer> resultantDuplicates=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        //Collectors.groupingBy(Function.identity() -> value has only counts of each grouping elements
        System.out.println("Duplicates approach 1");
        resultantDuplicates.forEach(System.out::println);
        System.out.println("Duplicates approach 2");
        list.stream().filter(n -> list.stream().filter(i->i==n).count() > 1).distinct().forEach(System.out::println);
        System.out.println("Duplicates approach 3");
        list.stream().filter(n-> Collections.frequency(list,n)>1).distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Duplicates approach 4");
        Set<Integer> st = new HashSet<>();
        list.stream().filter(n->!st.add(n)).distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Duplicates approach 5");

        list.stream().collect(Collectors.toMap(Function.identity(), p->1,Integer::sum)).entrySet()
                .stream()
                .filter(i->i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).forEach(System.out::println);
        //Map mapp=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Duplicates approach 6");
        //Collectors.groupingBy(Function.identity() -> gives values with list of all grouping elements
        list.stream().collect(Collectors.groupingBy(Function.identity()))
                .entrySet().stream().filter(i->i.getValue().size() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList())
                .forEach(System.out::println);
    }
}