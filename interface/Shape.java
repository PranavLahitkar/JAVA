/*

Problem Statement:
You are designing a simple shape drawing application. Shapes such as circles and rectangles need to be drawn on a canvas. Each shape must implement a method to calculate its area and display its details. Implement a Java program using interfaces to demonstrate polymorphism for different shapes.Combining all classes in one*/

// Shape.java
public interface Shape {
    double calculateArea();
    void displayDetails();
}

// Circle.java
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayDetails() {
        System.out.println("Circle - Radius: " + radius + ", Area: " + calculateArea());
    }
}

// Rectangle.java
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayDetails() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width + ", Area: " + calculateArea());
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.displayDetails();
        rectangle.displayDetails();
    }
}
