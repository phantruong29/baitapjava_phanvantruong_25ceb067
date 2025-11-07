package ex51_2;

import ex51.Point;

public class TestLineSub {
    public static void main(String[] args) {
        System.out.println("--- Test ex51_2.LineSub (Inheritance) ---");

        LineSub ls1 = new LineSub(0, 0, 4, 3);
        System.out.println("ls1: " + ls1);
        System.out.printf("Length: %.2f\n", ls1.getLength());

        Point p1 = new Point(10, 10);
        Point p2 = new Point(20, 20);
        LineSub ls2 = new LineSub(p1, p2);
        System.out.println("ls2: " + ls2);

        ls2.setXY(0, 0);
        System.out.println("ls2 mới: " + ls2);
    }
}