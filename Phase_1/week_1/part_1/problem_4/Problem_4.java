package Phase_1.week_1.part_1.problem_4;

public class Problem_4 {
    public static void main(String[] args) {

        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(3);

        Rectangle r1 = new Rectangle(1, 2);
        Rectangle r2 = new Rectangle(2, 3);
        Rectangle r3 = new Rectangle(3, 4);

        Object maxShape = c1;
        double maxArea = c1.area();

        // Check circles
        Circle[] circles = {c1, c2, c3};
        for (Circle c : circles) {
            if (c.area() > maxArea) {
                maxArea = c.area();
                maxShape = c;
            }
        }

        // Check rectangles
        Rectangle[] rectangles = {r1, r2, r3};
        for (Rectangle r : rectangles) {
            if (r.area() > maxArea) {
                maxArea = r.area();
                maxShape = r;
            }
        }

        // Output result
        if (maxShape instanceof Circle) {
            Circle c = (Circle) maxShape;
            System.out.println("Circle (radius = " + c.radius + ") has max area = " + maxArea);
        } else {
            Rectangle r = (Rectangle) maxShape;
            System.out.println("Rectangle (length = " + r.length + ", breadth = " + r.breadth + ") has max area = " + maxArea);
        }
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}