import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;
import java.util.Spliterator;
import java.util.stream.IntStream;

public class ArithmeticOperationUsingStreams {

    public static void main(String[] args){

        List<Integer> primes = Arrays.asList(2, 3, 5);
        IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
        System.out.println("Sum="+stats.getSum());
        System.out.println("Avg="+stats.getAverage());
        System.out.println("Cnt="+stats.getCount());
        System.out.println("Min="+stats.getMin());
        System.out.println("Max="+stats.getMax());

        System.out.println("Min="+IntStream.of(1,3,4).summaryStatistics().getMin());

        Spliterator s = primes.stream().spliterator();
        s.forEachRemaining(System.out::println);
        s.trySplit();

    }
}
