package Inheritance;

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat is meowing");
    }
}

class Kitty extends Cat {
    void meew(){
        System.out.println("Kitty meewss");
    }
}

public class MultiLevelInheritance {
    static void main(String[] args) {
        Kitty kitty = new Kitty();
        kitty.eat();
        kitty.meow();
        kitty.meew();
    }
}
