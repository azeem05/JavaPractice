import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {
    public static void main(String[] args){
        List<Integer> list = IntStream.of(0,1,2,2,3,3,3,4,5).boxed().collect(Collectors.toList());
        System.out.println("Sub list using list operation");
        int startIndex=1;
        int endIndex=4;
       list.subList(startIndex,endIndex).forEach(System.out::println);
        System.out.println("Sub list using stream operation");
       list.stream().skip(startIndex).limit(endIndex-startIndex).collect(Collectors.toList()).forEach(System.out::println);
    }
}