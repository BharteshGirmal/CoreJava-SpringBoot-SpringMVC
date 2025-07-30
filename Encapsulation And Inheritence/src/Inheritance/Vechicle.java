package Inheritance;

public class Vechicle {

    protected int noOfWheels;

    public Vechicle(){

    }
    public Vechicle(int noOfWheels){
        this.noOfWheels= noOfWheels;
    }

    public void commute(){
        System.out.println("Vehicle Class has been called with No of Wheels : "+ noOfWheels);
    }
}
