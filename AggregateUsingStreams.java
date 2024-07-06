import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AggregateUsingStreams {

    public static void main(String[] args){
        List<Integer> list= IntStream.of(4,7,8,2,6,14,15,7).boxed().collect(Collectors.toList());
        System.out.println("Approach 1");
        double avg = (list.stream().reduce(Integer::sum).orElse(0))/(double) list.size();
        //or use reduce(0,Integer::sum)
        System.out.println("Avg: "+avg);
        System.out.println("Approach 2");
        list=IntStream.of(4,7,8,2,6,14,15,7).boxed().collect(Collectors.toList());
        avg = (list.stream().mapToDouble(Integer::doubleValue).sum())/(double)list.size();
        //this is easier than the above
        //avg = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Avg: "+avg);
        System.out.println("Approach 3");
        double avg1 = Stream.of(10,15,3).collect(Collectors.averagingDouble(p -> p.intValue())).doubleValue();
        System.out.println("Avg = "+avg1);
        avg1 = Stream.of(10,15,3).collect(Collectors.averagingDouble(Integer::intValue)).doubleValue();
        System.out.println("Avg = "+avg1);
    }
}
