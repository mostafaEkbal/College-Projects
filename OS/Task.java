package OS;

public class Task implements Runnable {
    public void run() {
        System.out.println("I am a thread");
    }

    public static void main(String[] args) {
        Thread worker = new Thread(new Task());
        worker.start();
        try {
            worker.join();
        } catch (InterruptedException ie) {
        }
    }
}
