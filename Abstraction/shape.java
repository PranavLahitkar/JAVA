/*Let's consider a problem statement where we need to model different shapes (such as circles, rectangles, and triangles) in a graphical application. We want to calculate the area and perimeter of each shape, and also be able to draw them on the screen. We'll use abstraction in Java to create a solution for this problem.*/

//Combing all classfiles in one file
// Abstract Shape class
abstract class Shape {
    // Abstract methods to calculate area and perimeter
    abstract double calculateArea();
    abstract double calculatePerimeter();

    // Abstract method to draw the shape
    abstract void draw();
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle");
        // Code to draw circle on screen
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
        // Code to draw rectangle on screen
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        // Heron's formula to calculate area of triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    void draw() {
        System.out.println("Drawing Triangle");
        // Code to draw triangle on screen
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4, 5);

        // Calculating and displaying area and perimeter of each shape
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        circle.draw();

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        rectangle.draw();

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
        triangle.draw();
    }
}


