package Abstract;

public class AbtrractTest {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);
        car.getSetGo();
        car.commute();
        car.startTheCar();

        Circle circle = new Circle(125);
        circle.CalculateArea();

        Square square = new Square(584);
        square.CalculateArea();

        Egale egale = new Egale();
        egale.fly();


    }
}
