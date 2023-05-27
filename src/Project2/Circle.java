package Project2;
/*Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.*/

interface Shape{
    void  calculateArea();
    void  calculatePerimiter();

}
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void calculateArea() {
        System.out.println(Math.PI * radius * radius);

    }

    @Override
    public void calculatePerimiter() {
        System.out.println(2 * Math.PI * radius);

    }
}
class Square implements Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println(side * side);

    }

    @Override
    public void calculatePerimiter() {
        System.out.println(4 * side);

    }
}
