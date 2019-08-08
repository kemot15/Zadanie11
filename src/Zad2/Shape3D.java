package Zad2;

public abstract class Shape3D extends Shape{
    private int[] center = new  int[2];

    public Shape3D() {
    }

    public Shape3D(int[] center) {
        this.center = center;
    }

    public Shape3D(String name, int[] center) {
        super(name);
        this.center = center;
    }

    public int[] getCenter() {
        return center;
    }

    public void setCenter(int[] center) {
        this.center = center;
    }
}
