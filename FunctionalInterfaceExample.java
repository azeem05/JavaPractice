import java.math.BigDecimal;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.*;
import java.util.function.Consumer;

public class FunctionalInterfaceExample {

    public static void main(String[] args){

        Supplier<Integer> s=() -> 1;
        System.out.println("Supplier="+s.get());

        Consumer<Integer> consumer=(a)->System.out.println("Consumer ="+a);
        consumer.accept(5);

        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println("Bi Consumer =" + (a+b));
        biConsumer.accept(2,4);

        Predicate<Integer> predicate = a -> a > 0;
        System.out.println("Predicate = "+predicate.test(-1));

        BiPredicate<Integer, Integer> biPredicate = (a,b) -> (a+b) == 10;

        System.out.println("Bi Predicate="+biPredicate.test(2,81));

        UnaryOperator<Integer> ut = (a) -> a*a;

        System.out.println("Unary Operator = "+ut.apply(5));

        BinaryOperator<Integer> bt=(a,b)-> a*b;

        System.out.println("Binary Operator = "+bt.apply(1,2));

        BiFunction<Integer, Integer, Double> biFunction = (a,b) -> new BigDecimal(a).divide(new BigDecimal(b)).doubleValue();//two input Integers followed by return type Double
        System.out.println("BiFunction ="+biFunction.apply(5,4));

        Callable callable = () -> {
            try {
                //return "This is callable";
            } catch (Exception e) {
                //throw new Exception(e)
            }
            return "This is callable";
        };
        //System.out.println(callable.call());//this throws the exception

        MyCallable myCallable=new MyCallable();
        System.out.println(myCallable.call());

        BooleanSupplier booleanSupplier = () -> true;
        System.out.print("BooleanSupplier =" +booleanSupplier.getAsBoolean());

    }
}


