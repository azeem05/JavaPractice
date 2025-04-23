import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {
    public static void main(String[] args){
        List<Integer> list = IntStream.of(0,1,2,2,3,3,3,4,5).boxed().collect(Collectors.toList());
        System.out.println("Sub list using list operation");
        int startIndex=1;//inclusive
        int endIndex=4;//exclusive
       list.subList(startIndex,endIndex).forEach(System.out::println);
        System.out.println("Sub list using stream operation");
       list.stream().skip(startIndex).limit(endIndex-startIndex).collect(Collectors.toList()).forEach(System.out::println);

       int min=list.stream().min(Integer::compareTo).get();
       System.out.println("min="+min);
       //int max=list.stream().max((a,b) -> a-b).get();
        // int max=list.stream().max(Integer::compareTo).get();
        int max=list.stream().max(Comparator.naturalOrder()).get();
       System.out.println("max="+max);
       Optional<Integer> maxOpt=list.stream().max(Comparator.naturalOrder());
        maxOpt.ifPresent(data -> System.out.println(STR."max after checking isPresent=\{data}"));

        //To check if a given list matches with List of List
        List<Integer> target = List.of(1,3,5);
        List<List<Integer>> source = List.of( List.of(1,2,3), List.of(1,5,3));
        boolean isExist= source.stream().anyMatch(l -> l.containsAll(target));
        System.out.println("Does exist "+isExist);
        int sum=target.stream().reduce((a,b)->(a+b)).get();
        System.out.println("sum="+sum);

        long[] data=new long[]{4,3,2,6};
        long res=Arrays.stream(data).min().getAsLong();
        System.out.println("Min="+res);
        System.out.println("Long list sorting");
        Arrays.stream(data)
                .boxed()
                .toList()
                .stream()
                //.sorted()
                //.sorted(Comparator.naturalOrder())
                //.sorted(Comparator.comparing(Long::valueOf))
                .sorted(Comparator.comparingLong(Long::valueOf))
                .forEach(System.out::println);

    }
}