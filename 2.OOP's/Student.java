package ThisDemo;

public class Student {
    String name;
    int age;

    Student (String name,int age){    // this will give output of default values only as humne , this keyword nahi use kiya!
        name=name;  // output will be null
        age=age;    // output will be 0
    }


//    void setName(String name ,int age) {
////        this.name =  name;
////        this.age = age;
//    }

    void showName(){
        System.out.println(this.name);
    }

}
