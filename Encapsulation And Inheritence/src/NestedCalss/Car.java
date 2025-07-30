package NestedClass;

public class Car {

    private String brand = "Generic Car";

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand;
    }

    public static class Maruti {

        private String model = "Maruti Car";

        public String getModel() {
            return model;
        }

        public static class Swift {

            private String variant = "Swift ZXI+";

            public void showDetails() {
                Car car = new Car();
                Maruti maruti = new Maruti();
                Swift swift = new Swift();

                System.out.println("=== Car Details ===");
                System.out.println("Car Brand: " + car.getBrand());
                System.out.println("Maruti Model: " + maruti.getModel());
                System.out.println("Swift Variant: " + swift.variant);
                System.out.println("--------------------");
            }

            public static void main(String[] args) {
                Swift swift = new Swift();
                swift.showDetails();
            }
        }
    }
}
