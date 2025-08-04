package PassBy;

public class ByValue {

    public static void main(String[] args) {

        int x = 10 ;
        int y = 60;
        int add = sum(x, y);
        System.out.println(add);
    }

    public static int sum(int a , int b){
        a+=b;
        return a;
    }
}
