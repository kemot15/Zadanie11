package Zad2;

import java.util.Arrays;

public class Line2D extends Shape2D{
    private int[] point1 = new int[2];
    private int[] point2 = new int[2];

    public Line2D() {
    }

    public Line2D(int[] point1, int[] point2) {
        //super();
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line2D(String name, int[] point1, int[] point2) {
        super(name);
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line2D(String name, int x, int y, int[] point1, int[] point2) {
        super(name, x, y);
        this.point1 = point1;
        this.point2 = point2;
    }

    public Line2D(int x, int y) {
        super(x, y);
    }

    public int[] getPoint1() {
        return point1;
    }

    public void setPoint1(int[] point1) {
        this.point1 = point1;
    }

    public int[] getPoint2() {
        return point2;
    }

    public void setPoint2(int[] point2) {
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return super.toString() + " wyznaczony przez wspolrzedne " +
                Arrays.toString(point1) +
                Arrays.toString(point2) +
                " ma dlugosc ";
    }
}
