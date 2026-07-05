public class Babu {

    void sorry(String name){
        System.out.println(name + " sorry Bolo...");
    }

    void add(int a, int b){
        System.out.println("Sum: "+(a+b));
    }
}



public void main(String[] args) {
        Babu b = new Babu();
        b.sorry("Aman");
        b.add(3,5);
    }

