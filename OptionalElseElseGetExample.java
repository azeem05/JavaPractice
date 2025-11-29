import java.util.Optional;

public class OptionalElseElseGetExample {

    public static void main(String[] args) {
        System.out.println("Executing Optional Else or ElseGet");
        String nullName = "Test";
        System.out.println("Else Get - Lazy evaluation, only when optional is empty");
        String name = Optional.of(nullName).orElseGet(() ->  defaultString());
        System.out.println("name="+name);
        System.out.println("Else - Eager evaluation, the else part is always evaluated");
        String name1 = Optional.of(nullName).orElse( defaultString());
        System.out.println("name="+name1);
    }

    public static String defaultString() {
        System.out.println("default called");
        return "John";
    }
}
