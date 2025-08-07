package shape;

public class Circle {
    double radius = 0;
    final double PI = Math.PI;
    public Circle(double x) {
        radius = (double) (x/2.0);
    }
    public double area(){
        return PI*radius*radius;
    }
    public double perimeter(){
        return 2*PI*radius;
    }
}
