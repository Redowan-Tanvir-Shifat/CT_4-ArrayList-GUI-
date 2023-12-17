class Rectangle {
    public double width;
    public  double height;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
class Square extends Rectangle {
    public Square() {
    }
    public Square(double length) {
        super(length, length);
    }
    @Override
    public double getArea() {
        return super.getArea();
    }
    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}
class Circle extends Square {
    public Circle(double radius) {
        super(radius);
    }
    @Override
    public double getArea() {
        return (Math.PI * super.getArea());
    }

    @Override
    public double getPerimeter() {
        return (Math.PI * super.getPerimeter()) / 2;
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Square square = new Square(5.0);
        Circle circle = new Circle(5.0);

        System.out.println("Area of Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
        System.out.println();
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getPerimeter());
        System.out.println();
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());
    }
}