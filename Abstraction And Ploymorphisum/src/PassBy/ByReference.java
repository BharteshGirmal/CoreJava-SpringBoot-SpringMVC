package PassBy;

public class ByReference {


    public static void main(String[] args) {

        Point p1 = new Point(10,20);
        System.out.println("Value of X : "+ p1.getX());
        System.out.println("Value of Y : "+ p1.getY());
        System.out.println(p1);
        move(p1);
        System.out.println("Value of X : "+ p1.getX());
        System.out.println("Value of Y : "+ p1.getY());
    }

    public static void move(Point p1){
        p1.x++;
        p1.y++;
        System.out.println(p1);
    }
    public static  class Point{
        int x ;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
