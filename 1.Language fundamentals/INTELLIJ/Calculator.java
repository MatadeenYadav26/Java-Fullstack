public class Calculator {

    int add(int a,int b){
        int res =  a+b;
        return res;
    }

    static void main(String[] args) {
        Calculator c = new Calculator();
        int res = c.add(10,20);
        System.out.println(res) ;
    }
}
