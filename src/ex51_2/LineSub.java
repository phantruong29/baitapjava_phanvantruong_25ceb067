package ex51_2;

import ex51.Point;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // Điểm bắt đầu
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY()); // Gọi constructor của ex51.Point với tọa độ begin
        this.end = end;
    }

    public Point getEnd() { return end; }
    public void setEnd(Point end) { this.end = end; }

    public int getEndX() { return end.getX(); }
    public void setEndX(int x) { end.setX(x); }
    public int getEndY() { return end.getY(); }
    public void setEndY(int y) { end.setY(y); }
    public void setEndXY(int x, int y) { end.setXY(x, y); }

    public double getLength() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "ex51_2.LineSub[begin=" + super.toString() + " to end=" + end + "]";
    }
}