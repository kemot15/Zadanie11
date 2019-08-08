package Zad2;

public abstract class Shape2D extends Shape {
    private int x;
    private int y;

    public Shape2D() {
    }

    public Shape2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape2D(String name) {
        super(name);
    }

    public Shape2D(String name, int x, int y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
