package Geometry;

public class Calculator {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100,200);
        System.out.println(rectangle);
        rectangle.getAreaOfRectangle();

        Circle circle = new Circle(455.2);
        System.out.println(circle);
        circle.getAreaOfCircle();
        circle.getCircumference();
    }
}
