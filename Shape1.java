//take a class called shape from this derive three classes - triangle,rectangle,circle. take data member and 
//method name according to the requirement and print area of all the three child classes
class Shape {
    double area;

    void displayArea() {
        System.out.println("Area = " + area);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void calculateArea() {
        area = l * b;
    }
}

class Circle extends Shape {   // fixed naming
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

public class Shape1 {   // file name must be Shape1.java
    public static void main(String[] args) {

        Triangle t = new Triangle(10, 5);
        t.calculateArea();
        System.out.print("Triangle ");
        t.displayArea();

        Rectangle r = new Rectangle(8, 4);
        r.calculateArea();
        System.out.print("Rectangle ");
        r.displayArea();

        Circle c = new Circle(4);
        c.calculateArea();
        System.out.print("Circle ");
        c.displayArea();
    }
}
