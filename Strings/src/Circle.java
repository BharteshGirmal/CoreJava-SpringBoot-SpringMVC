public class Circle {

    int radius;
    double PI = Math.PI;

    Circle(int radius){
        this.radius=radius;
    }
    public double getCircumference(){
        return 2 * PI * radius;
    }
    public double getAreaOfCircle(){
        return PI * Math.pow(radius,2);
    }

    public static void main(String[] args) {
        Circle cc = new Circle(20);
        System.out.println("Area of Circle is "+ cc.getAreaOfCircle());
        System.out.println("Circumference Of a Circle is "+cc.getCircumference());
    }
}
