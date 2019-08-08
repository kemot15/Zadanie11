package Zad2;

public class LineCalc {
    public int lineLength (Line2D line){
        int[] point1 = line.getPoint1();
        int[] point2 = line.getPoint2();
        return (int)Math.abs(Math.sqrt(Math.pow((point2[0]-point1[0]), 2)+ Math.pow((point2[1] - point1[0]), 2)));
    }
}
