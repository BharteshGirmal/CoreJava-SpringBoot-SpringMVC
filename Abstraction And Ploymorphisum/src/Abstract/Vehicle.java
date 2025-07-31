package Abstract;

public abstract class Vehicle implements Transport {

    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    @Override
    public void getSetGo() {
        System.out.println("Moving the vehicle from one place to another");
    }

    public abstract void startTheCar();


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                '}';
    }
}
