package OS;

public class Task implements Runnable {
    public void run() {
        System.out.println("I am a thread");
    }

    public static void main(String[] args) {
        WhereAmI place1 = new WhereAmI(2);
        WhereAmI place2 = new WhereAmI(1);
        WhereAmI place3 = new WhereAmI(3);

        try {
            place1.start();
            place2.start();
            place3.start();
        } catch (Exception ie) {
            System.out.println(ie);
        }
    }
}
