package Phase_1.week_1.part_2.Problem_2;

public class Problem_2 {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Rectangle(2, 3),
                new Circle(4),
                new Triangle(12, 10, 5)
        };

        for (Shape s : shapes) {
            System.out.println("Shape: " + s.getClass().getSimpleName());
            System.out.println("Area: " + s.area());
            System.out.println("Perimeter: " + s.perimeter());
            System.out.println("----------------------");
        }
    }
}

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle() {
    }

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle extends Shape {

    double a;
    double b;
    double c;

    Triangle() {
    }

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double perimeter() {
        return a + b + c;
    }
}

class Circle extends Shape {

    double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
