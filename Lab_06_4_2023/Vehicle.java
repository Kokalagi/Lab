package polymorphism;


class Vehicle1 
{
    String brand;
    String model;
    int year;

    public void drive() 
    {
        System.out.println("Driving...");
    }
}

class Car extends Vehicle1 
{
    String color;

    public void honk() {
        System.out.println("Honking...");
    }
}

public class Vehicle 
{
    public static void main(String[] args) 
    {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Corolla";
        car.year = 2022;
        car.color = "Blue";

        System.out.println("Car details:");
        System.out.println("Brand: " + car.brand);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Color: " + car.color);

        car.drive();
        car.honk();
    }
}
