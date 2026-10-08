package OOPs;

public class Vehicle_client {
    public static void main(String[] args) {
        Car c=new Car("yamaha", 500);
        Bike b=new Bike("RE", 200);
        c.printDetails();
        b.printDetails();
        System.out.println(c.calculateRentalCost(10));
        System.out.println(b.calculateRentalCost(10));
    }
}
