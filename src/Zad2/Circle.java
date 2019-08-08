package Zad2;

public class Circle extends GeometrickShape {
    int[] center = new int[2];
    int[] rad = new int[2];

    public Circle() {
    }

    public Circle(int[] center, int[] rad) {
        this.center = center;
        this.rad = rad;
    }

    public Circle(int x, int y, int[] center, int[] rad) {
        super(x, y);
        this.center = center;
        this.rad = rad;
    }

    public Circle(String name, int[] center, int[] rad) {
        super(name);
        this.center = center;
        this.rad = rad;
    }

    public Circle(String name, int x, int y, int[] center, int[] rad) {
        super(name, x, y);
        this.center = center;
        this.rad = rad;
    }

    public int[] getCenter() {
        return center;
    }

    public void setCenter(int[] center) {
        this.center = center;
    }

    public int[] getRad() {
        return rad;
    }

    public void setRad(int[] rad) {
        this.rad = rad;
    }
}
