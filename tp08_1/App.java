package tp07_1;

public class App {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Talkative(i));
            threads[i].start();
        }
        System.out.println("FIN.");


    }
}
