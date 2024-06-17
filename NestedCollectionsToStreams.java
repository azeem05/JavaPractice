import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NestedCollectionsToStreams {
    public static void main(String[] args){
        Map<String, List<Integer>> mapData = new HashMap<>();
        mapData.put("key1", IntStream.of(1,2,3).boxed().collect(Collectors.toList()));
        mapData.put("key2", IntStream.of(4,5,6).boxed().collect(Collectors.toList()));
        mapData.put("key3", IntStream.of(7,8,9).boxed().collect(Collectors.toList()));
        mapData.values().stream().flatMap(i->i.stream()).collect(Collectors.toList()).forEach(System.out::println);
        //mapData.values().stream().map(i->i.stream().collect(Collectors.toList())).toList().forEach(System.out::println);
        System.out.println("mapData values ");
        mapData.values().stream().forEach(System.out::println);
        System.out.println("Reduce");
        mapData.values().stream().reduce((first,second)->second).orElse(null).stream().forEach(System.out::println);

        //Reduce
        List<Integer> list=IntStream.of(1,2,3,4,5,6,7,8,9).boxed().collect(Collectors.toList());
        System.out.println("List is :"+list);
        //list.stream().reduce((first,second)->second).stream().forEach(System.out::println);
        Integer value=list.stream().reduce((first,second)->second).orElse(null).intValue();
        System.out.println("Value="+value);
    }
}
