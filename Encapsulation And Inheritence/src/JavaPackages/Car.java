package JavaPackages;

public class Car {

    public  String vechicleName;
    public  String vechicleColor;
    private double costOfPurchase;
    long modelNumber;

    public  Car(){

    }

    public Car(String vechicleName,String vechicleColor, double costOfPurchase, long modelNumber){
        this.vechicleName=vechicleName;
        this.vechicleColor=vechicleColor;
        this.costOfPurchase=costOfPurchase;
        this.modelNumber=modelNumber;
    }

    public long getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(long modelNumber) {
        this.modelNumber = modelNumber;
    }

    public double getCostOfPurchase() {
        return costOfPurchase;
    }

    public void setCostOfPurchase(double costOfPurchase) {
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return ("The Car Have Following Details\n1.Name: "+this.vechicleName+"\n2.Color: "+this.vechicleColor+"\nPrice: "+this.costOfPurchase+"\n4.Model No: "+this.modelNumber);
    }
}
