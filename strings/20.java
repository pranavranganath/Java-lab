
    // Abstract class Shape
abstract class Shape {
    // Abstract method for calculating area
    public abstract double calculateArea();

 
    public abstract double calculatePerimeter();
}

// Subclass Circle extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

   
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

  
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class
public class Figures {
    public static void main(String[] args) {
        // Creating instances of Circle and Triangle
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);

        // Calculating and displaying area and perimeter for Circle
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Calculating and displaying area and perimeter for Triangle
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
