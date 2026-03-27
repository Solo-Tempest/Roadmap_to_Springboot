package Phase_1.week_1.part_2.Problem_4;

public class Problem_4 {
    public static void main(String[] args) {
        Vehicle v = new ElectricCar("toyota", 300, "Electric", 4, 200, 200);
        System.out.println(v);
    }
}

class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return "Brand : " + brand + "\n" + "Speed : " + speed;
    }
}

class Car extends Vehicle {
    String fuelType;
    int numberOfDoors;

    public Car(String brand, int speed, String fuelType, int numberOfDoors) {
        super(brand, speed);
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "fuelType : " + fuelType + "\n" + "numberOfDoors : " + numberOfDoors;
    }
}

class ElectricCar extends Car {
    int batteryCapacity;
    int range;

    public ElectricCar(String brand,
                       int speed,
                       String fuelType,
                       int numberOfDoos,
                       int batteryCapacity,
                       int range
    ) {
        super(brand, speed, fuelType, numberOfDoos);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + "Battery Capacity : " + batteryCapacity + "\n" + "Range : " + range;
    }
}
