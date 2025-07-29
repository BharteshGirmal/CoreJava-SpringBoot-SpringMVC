package Geometry;

public class Circle {

    private double PI = Math.PI;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(long PI) {
        this.PI = PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getAreaOfCircle(){
        double Area = this.PI * Math.pow(this.radius,2);
        System.out.println("Area of Circle is : "+ Area);
    }

    public void getCircumference(){
        double circumference = 2 *  this.PI * this.radius;
        System.out.println("Circumference of Circle : "+ circumference);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", radius=" + radius +
                '}';
    }
}
