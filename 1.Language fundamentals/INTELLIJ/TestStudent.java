class Student{
    String name;
    int age;

    void study(){
        System.out.println("Student is studying");
    }
}







public class TestStudent {

    static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.age);
        System.out.println(s.name);

        s.name = "Aman";
        s.age = 21;
        System.out.println(s.name);
        System.out.println(s.age);
        s.study();

        Student s2 = new Student();
        System.out.println(s2.age);
        System.out.println(s2.name);
    }



}
