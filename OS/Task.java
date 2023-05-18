package OS;

public class Task implements Runnable {
    private int n;

    public Task(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("I am in Thread " + n);
        }
    }

    public static void main(String[] args) {
        Task place1 = new Task(2);
        Thread thread1 = new Thread(place1);
        Task place2 = new Task(1);
        Thread thread2 = new Thread(place2);
        Task place3 = new Task(3);
        Thread thread3 = new Thread(place3);

        try {
            thread1.start();
            thread2.start();
            thread3.start();
        } catch (Exception ie) {
            System.out.println(ie);
        }
    }
}
