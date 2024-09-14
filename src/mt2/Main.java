package mt2;

public class Main {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            Printer printer = new Printer(i);
            Thread thread = new Thread(printer);
            thread.start();
        }
    }
}
