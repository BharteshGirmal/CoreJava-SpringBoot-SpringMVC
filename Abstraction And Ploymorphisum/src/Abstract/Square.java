package Abstract;

public class Square extends Shape{

    private int sides;

    public Square(int sides) {
        this.sides = sides;
    }

    public int getSides() {

        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    @Override
    public void CalculateArea() {
        double area = 4 * sides;
        System.out.println("Area of Square "+ area);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sides=" + sides +
                '}';
    }
}
