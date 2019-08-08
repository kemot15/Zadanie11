package Zad2;

public class Ball extends Shape3D{
    int[] rad = new int[2];

    public Ball() {
    }

    public Ball(int[] rad) {
        this.rad = rad;
    }

    public Ball(int[] center, int[] rad) {
        super(center);
        this.rad = rad;
    }

    public Ball(String name, int[] center, int[] rad) {
        super(name, center);
        this.rad = rad;
    }

    public int[] getRad() {
        return rad;
    }

    public void setRad(int[] rad) {
        this.rad = rad;
    }
}
