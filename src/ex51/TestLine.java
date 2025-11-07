package ex51;

public class TestLine {
    public static void main(String[] args) {
        System.out.println("--- Test ex51.Line (Composition) ---");

        Line l1 = new Line(0, 0, 3, 4);
        System.out.println("l1: " + l1);
        System.out.printf("Length: %.2f\n", l1.getLength());

        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);

        Line l2 = new Line(p1, p2);
        System.out.println("l2: " + l2);

        l2.setEndXY(10, 10);
        System.out.println("L2 mới: " + l2);
    }
}