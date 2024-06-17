public class FunctionalInterfaceExample {

    public static void main(String[] args){
        Runnable r = () -> System.out.println("Runnable thread created");
        r.run();
        Thread t = new Thread(() -> System.out.println("Thread created"));
        t.start();
    }
}
