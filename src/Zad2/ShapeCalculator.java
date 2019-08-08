package Zad2;

public class ShapeCalculator extends LineCalc implements Calc2d, Calc3d{
    @Override
    public int lineLength(Line2D line) {
        return super.lineLength(line);
    }

    @Override
    public int ballVolume(Ball ball) {
        Line2D line2D = new Line2D(ball.getCenter(), ball.getRad());
        return (int)(4/3*Math.PI*Math.pow(lineLength(line2D), 3));
    }

    @Override
    public int cubeVolume(Cube cube) {
        Line2D line2D = new Line2D(cube.getCenter(), cube.getPointB());
        return (int)Math.pow(lineLength(line2D), 3);
    }

    @Override
    public int volume(Shape3D shape) {
        if (shape instanceof Ball)
            return ballVolume((Ball)shape);
        else// (shape instanceof Cube)
            return cubeVolume((Cube)shape);
    }

    @Override
    public int circleArea(Circle circle) {
        Line2D line2D = new Line2D(circle.getCenter(), circle.getRad());
        return (int)(2*Math.PI * lineLength(line2D));
    }

    @Override
    public int rectangleArea(Rectangle rectangle) {
        Line2D lineA = new Line2D(rectangle.getPointA(), rectangle.getPointB());
        Line2D lineB = new Line2D(rectangle.getPointA(), rectangle.getPointC());
        return lineLength(lineA)*lineLength(lineB);
    }

    @Override
    public int shapeArea(GeometrickShape shape) {
        if (shape instanceof Circle)
            return circleArea((Circle)shape);
        else //if (shape instanceof Rectangle)
            return rectangleArea((Rectangle)shape);
    }
}
