package mt1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!  from thread: " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();
    }
}
