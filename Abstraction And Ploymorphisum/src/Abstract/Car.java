package Abstract;

public class Car extends Vehicle{

    private int noOfwWheels;

    public Car(String type, int noOfwWheels) {
        super(type);
        this.noOfwWheels=noOfwWheels;
    }

    public int getNoOfwWheels() {
        return noOfwWheels;
    }

    public void setNoOfwWheels(int noOfwWheels) {
        this.noOfwWheels = noOfwWheels;
    }

    @Override
    public void startTheCar() {
        System.out.println("Car Now Started");
    }

    public void commute(){
        System.out.println("Car Name "+ getType());
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfwWheels=" + noOfwWheels +
                '}';
    }
}
