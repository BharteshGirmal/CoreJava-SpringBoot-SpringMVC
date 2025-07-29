import JavaPackages.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car newCar = new Car();
        newCar.vechicleName="Mahindra Bolero";
        newCar.vechicleColor="White";
        System.out.println(newCar.getCostOfPurchase());
        // here we cannot access the private and default fields in other packages
        System.out.println(newCar);
    }
}