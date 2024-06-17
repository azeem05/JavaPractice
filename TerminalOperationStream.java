import java.util.Arrays;

public class TerminalOperationStream {
    public static void main(String[] args) {
        System.out.println("Stream without terminal operation");

        Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
            System.out.println("doubling " + i);
            return i * 2;
        });

        System.out.println("Stream with terminal operation");
        int sum=Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
            System.out.println("doubling " + i);
            return i * 2;
        }).sum();
        System.out.println(sum);
        //Terminal operations include forEach, reduce, collect and sum.
    }
}
