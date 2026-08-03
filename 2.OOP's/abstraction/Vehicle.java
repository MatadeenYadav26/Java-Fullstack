package Abstraction;

abstract public class Vehicle {

    abstract void start();
}



class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("car start with key");
    }
}

class Truck extends Vehicle{
    @Override
    void start() {
        System.out.println("truck start with engine");
    }
}