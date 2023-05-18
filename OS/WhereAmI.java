package OS;

public class WhereAmI extends Thread {
    private int n;

    public WhereAmI(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("I am in Thread " + n);
        }
    }
}