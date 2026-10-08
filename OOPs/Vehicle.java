package OOPs;

public abstract class Vehicle {

    private String brand;
    private double ratePerDay;

    public Vehicle(String brand, double ratePerDay) {
        if (ratePerDay <= 0) {
            throw new IllegalArgumentException();
        }
        this.brand = brand;
        this.ratePerDay = ratePerDay;
    }

    public String getBrand() {
        return brand;
    }

    public double getRatePerDay() {
        return ratePerDay;
    }

    abstract double calculateRentalCost(int days);

    public void printDetails() {
        System.out.println(brand + " " + ratePerDay);
    }
}

class Car extends Vehicle {

    public Car(String brand, double ratePerDay) {
        super(brand, ratePerDay);
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getRatePerDay() * days;
        if (days > 7) {
            cost = cost * 0.9;
        }
        return cost;
    }
}

class Bike extends Vehicle {
    public Bike(String brand, double ratePerDay) {
        super(brand, ratePerDay);
    }
    @Override
    public double calculateRentalCost(int days) {
        double cost = getRatePerDay() * days;

        return cost + 50;
    }
}
