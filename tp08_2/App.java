package tp07_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++)
            numbers[i] = i;

        Sommeur obj1 = new Sommeur(numbers,0,4);
        Sommeur obj2 = new Sommeur(numbers,4,7);
        Sommeur obj3 = new Sommeur(numbers,7,10);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(obj1);
        executorService.submit(obj2);
        executorService.submit(obj3);

        executorService.shutdown();
        Thread.sleep(3000);
        System.out.println("sum is "+(obj1.getSomme()+obj2.getSomme()+obj3.getSomme()));

    }
}
