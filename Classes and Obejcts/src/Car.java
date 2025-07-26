public class Car {

    // Instance Variable
    int noOFWheels;
    String color;
    int fuelInLiters;
    int maxSpeed;
    int minSpeed;

    Car(){
        this.noOFWheels=4;
        this.color="Black";
        this.fuelInLiters=100;
        this.maxSpeed=60;
        this.minSpeed=220;
    }

    // Methods
    public void drive(){
        System.out.println("Engine is started now car is in drive mode");
    }

    public int currentFuel(){
        return fuelInLiters;
    }

    public void reFuel(float num){
        fuelInLiters +=num;
    }

    public void  accelerate(){
        System.out.println();
        fuelInLiters--;
    }

    public void refuelTheCar(){
        System.out.println("TRefueling the Car Now");
        fuelInLiters--;
    }


    // This Keyword

    public Car startTheCar(){
        if(fuelInLiters == 0){
            System.out.println("No Fuel to Start the Car");
        }else if(fuelInLiters < 5){
            System.out.println("Car Started but, Fuel level is in Reserved Refuel the Car");
        }
        else {
            System.out.println("Starting the Engine Vroooommm..........");
        }

        return this;
    }

}
