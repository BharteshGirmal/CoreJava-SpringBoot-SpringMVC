package Inheritance;

public class TestInheritance {

    public static void main(String[] args) {
        MotorCycle newBike = new MotorCycle();
        newBike.commute();
        newBike.start();

        FourWheeler newCar = new FourWheeler();
        newCar.commute();
        newCar.start();

    }
}
