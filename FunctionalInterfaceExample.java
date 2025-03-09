import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceExample {

    public static void main(String[] args){

        Supplier<Integer> s=() -> 1;
        System.out.println("Supplier="+s.get());

        Consumer<Integer> consumer=(a)->System.out.println("Consumer ="+a);
        consumer.accept(5);

        UnaryOperator<Integer> ut = (a) -> a*a;

        System.out.println("Unary Operator = "+ut.apply(5));

        BinaryOperator<Integer> bt=(a,b)-> a*b;

        System.out.println("Binary Operator = "+bt.apply(1,2));


    }
}
