
class Shape {
    void area() {
        System.out.println("Shape area");
    }
}

class Circle extends Shape {
    int r;

    Circle(int r) {
        this.r = r;
    }

    void area() {
        System.out.printf("Circle area: %.2f%n", Math.PI * r * r);
    }
}

class Rectangle extends Shape {
    int l, w;

    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }

    void area() {
        System.out.println("Rectangle area: " + (l * w));
    }
}

class Triangle extends Shape {
    int b, h;

    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    void area() {
        System.out.println("Triangle area: " + (0.5 * b * h));
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape[] s = {new Circle(7), new Rectangle(5, 4), new Triangle(6, 8)};

        for (Shape x : s)
            x.area();
    }
}
