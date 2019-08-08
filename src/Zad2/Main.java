package Zad2;

public class Main {
    public static void main(String[] args) {
        int[] point1 = {1,1};
        int[] point2 = {1,3};
        int[] point3 = {5,1};

        Shape[] shapes = new Shape[5];
        shapes[0] = new Line2D ("Odcinek", point1, point2);
        shapes[1] = new Rectangle("Prostokat", point1, point2, point3);
        shapes[2] = new Circle("Kolo", point1, point2);
        shapes[3] = new Ball("Kula", point1, point2);
        shapes[4] = new Cube("Szescian", point1, point2);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println(shapes[0].toString() + shapeCalculator.lineLength((Line2D) shapes[0]));
        System.out.println("Prostokat " + shapeCalculator.rectangleArea((Rectangle) shapes[1]));
        System.out.println("Kolo " +shapeCalculator.circleArea((Circle)shapes[2]));
        System.out.println("Kula " + shapeCalculator.ballVolume((Ball) shapes[3]));
        System.out.println("Szescian " + shapeCalculator.cubeVolume((Cube) shapes[4]));

        for ( int i = 0; i < shapes.length; i++ ){
            if (shapes[i] instanceof Shape3D){
                System.out.println(shapes[i].getName() + " " + shapeCalculator.volume((Shape3D)shapes[i]));
            }else if (shapes[i] instanceof GeometrickShape){
                System.out.println(shapes[i].getName() + " "+ shapeCalculator.shapeArea((GeometrickShape)shapes[i]));
            }else
                System.out.println(shapes[i].toString() + shapeCalculator.lineLength((Line2D) shapes[i]));
        }
    }
}
