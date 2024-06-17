import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringOperationsUsingStreams {

    public static  void main(String[] args){

        String inp="find words containing less than five characters";
        System.out.println("Convert string to list");
        List<String> stringList=Arrays.stream(inp.split(" ")).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("Convert each words into upper case");
        stringList=stringList.stream().map(p -> p.toUpperCase()).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("Return words having less than 5 characters");
        stringList=Arrays.stream(inp.split(" ")).filter( p -> p.length() < 5).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("Sorting the string list - approach 1");
        stringList=Arrays.stream(inp.split(" ")).sorted().collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("Sorting the string list - approach 2");
        stringList=Arrays.stream(inp.split(" ")).sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("Sorting the string list - approach 3");
        stringList=Arrays.stream(inp.split(" ")).sorted(Comparator.comparing(p->p.toString())).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("Sorting the string list - reverse 1");
        stringList=Arrays.stream(inp.split(" ")).sorted((a,b) -> b.compareTo(a)).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("Sorting the string list - reverse 2");
        stringList=Arrays.stream(inp.split(" ")).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(stringList);


        Stream.of(10,15,"2").forEach( p -> {
            if( p instanceof  String) {
                System.out.println("String ="+p);
            }
            if( p instanceof  Integer) {
                System.out.println("Integer ="+p);
            }
        });


        Stream.of("h", "l", "l", "o", "s", "t", "r", "e", "a", "m", "s", "!")
                .filter(s -> {
                    System.out.println("Cute filter: " + s);
                    return true;
                }).forEach(p -> System.out.println("For each:"+p));

        String s="ahbgdc";
        //IntStream.range(0,s.toCharArray().length).mapToObj(c->s.toCharArray()[c]).sorted().forEach(System.out::println);

        //Convert string to char array, then using mapToObj convert each char to string and sort. then using joining convert the stream to string
        String orderedS=s.chars().mapToObj(c-> String.valueOf((char)c)).sorted().collect(Collectors.joining());
        System.out.println(s+",Ordered="+orderedS);


    }
}
