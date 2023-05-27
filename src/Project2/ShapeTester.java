package Project2;

public class ShapeTester {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Square square = new Square(10.5);
        circle.calculateArea();
        circle.calculatePerimiter();
        square.calculateArea();
        square.calculatePerimiter();

    }
}
