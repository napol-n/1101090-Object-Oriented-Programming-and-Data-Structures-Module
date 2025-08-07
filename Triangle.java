package shape;
import java.util.Map; // This import is not used in the code, so you can remove it.

public class Triangle {
    double height = 0.0f;  // Initialize with a default value (0.0f for float)
    double base = 0.0f;     // Initialize with a default value (0.0f for float)

    public Triangle(double x) {
        if (x <= 0) { // Check for non-positive values
            throw new IllegalArgumentException("Triangle side lengths must be positive.");
        }
        height = x;
        base = x;
    }

    public double area() {
        return (1.0f / 2.0f) * base * height; // Use float literals for clarity
    }

    public double perimeter() {
        double sideA = base / 2.0;
        double sideB = height;
        double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return sideC + sideC + base;
    }
}
