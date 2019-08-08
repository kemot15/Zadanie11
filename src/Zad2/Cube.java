package Zad2;

public class Cube extends Shape3D {
    int[] pointB = new int[2];

    public Cube() {
    }

    public Cube(int[] pointB) {
        this.pointB = pointB;
    }

    public Cube(int[] center, int[] pointB) {
        super(center);
        this.pointB = pointB;
    }

    public Cube(String name, int[] center, int[] pointB) {
        super(name, center);
        this.pointB = pointB;
    }

    public int[] getPointB() {
        return pointB;
    }

    public void setPointB(int[] pointB) {
        this.pointB = pointB;
    }
}
