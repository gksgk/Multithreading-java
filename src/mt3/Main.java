package mt3;

import mt2.Printer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i=1;i<101;i++){
            Printer printer = new Printer(i);
            executorService.execute(printer);
        }
    }
}
