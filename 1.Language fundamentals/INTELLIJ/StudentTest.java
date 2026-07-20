public class StudentTest {
    static void main(String[] args) {
        Student s1 = new Student("Aman",21,78);
        System.out.println(s1.name);

        Student s2 = new Student();
        System.out.println(s2.name);
        System.out.println(s2.age);


        Student s3 = new Student("Aman",21);
        Student s4 = new Student("Aman");

    }
}
