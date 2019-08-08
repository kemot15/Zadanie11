package Zad2;

import java.util.Arrays;

public class Rectangle extends GeometrickShape{
    private int[] pointA = new int[2];
    private int[] PointB = new int[2];
    private int[] PointC = new int[2];

    public Rectangle() {
    }

    public Rectangle(int[] pointA, int[] pointB, int[] pointC) {
        this.pointA = pointA;
        PointB = pointB;
        PointC = pointC;
    }

    public Rectangle(int x, int y, int[] pointA, int[] pointB, int[] pointC) {
        super(x, y);
        this.pointA = pointA;
        PointB = pointB;
        PointC = pointC;
    }

    public Rectangle(String name, int[] pointA, int[] pointB, int[] pointC) {
        super(name);
        this.pointA = pointA;
        PointB = pointB;
        PointC = pointC;
    }

    public Rectangle(String name, int x, int y, int[] pointA, int[] pointB, int[] pointC) {
        super(name, x, y);
        this.pointA = pointA;
        PointB = pointB;
        PointC = pointC;
    }

    public int[] getPointA() {
        return pointA;
    }

    public void setPointA(int[] pointA) {
        this.pointA = pointA;
    }

    public int[] getPointB() {
        return PointB;
    }

    public void setPointB(int[] pointB) {
        PointB = pointB;
    }

    public int[] getPointC() {
        return PointC;
    }

    public void setPointC(int[] pointC) {
        PointC = pointC;
    }

    @Override
    public String toString() {
        return super.toString() +
                " o dlugościach bokow ";
    }
}
