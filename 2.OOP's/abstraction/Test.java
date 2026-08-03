package Abstraction;

public class Test {
    static void main(String[] args) {
        Vehicle v1 = new Truck();
        Vehicle v2 = new Car();
        v1.start();
        v2.start();
    }
}
