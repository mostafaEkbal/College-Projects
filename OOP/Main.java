package OOP;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getRadius());
        Circle circle2 = new Circle(50.6);
        System.out.println(circle2.getRadius());

    }
}
