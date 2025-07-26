//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car newCar = new Car();
        System.out.println("Classes and Objects");
        newCar.drive();

        Car swift = new Car();
        swift.reFuel(100);
        swift.startTheCar().drive();

        Book mtBook = new Book();
        System.out.println("total Books are "+ Book.getTotalNoBooks());
        mtBook.borrowBook();
        System.out.println("total Books After Borrowing "+ Book.getTotalNoBooks());
        mtBook.retrunBook();
        System.out.println("total Books After Returning "+ Book.getTotalNoBooks());
    }
}