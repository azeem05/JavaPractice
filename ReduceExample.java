import java.util.Arrays;
import java.util.List;


public class ReduceExample {

    public static void main(String[] args) {

        List<Integer> stringList= Arrays.asList(new Integer[] {1,2,3,4,5});
        Integer res1=stringList.stream().reduce((a,b) -> a+b).orElse(0);
        System.out.println("res="+res1);

        Integer res2=stringList.stream().reduce(Integer::sum).orElse(0);
        System.out.println("res="+res2);
    }
}
