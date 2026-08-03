package ThisDemo;

class CFS{
    String name = " Instance : CodeForSuccess.in";
    CFS(){
        String name = "CodeForSuccess.in";
        System.out.println("CFS Default Constructor...");
        // while calling , even if using this keyword , toh apna cfs default constructor kese call ho rha h ?? :
//        Reason: as koi v default constructor by default , super() keyword use karega , toh ye cfs class ka automagtically sabse pehle run hoga and cfs ayega , baat rhi this() ki
//        so , this() key word current constructor ko call krega , joki waha se vo course() constructor ko call kar rha hai!
//        this me agar : string daldu toh , vo string wala call karta but koi error aa rha h so yani k most probably same class me call nhi hota h, toh yha pr , default call par course() hi ata hai!

    }
}

class Course extends CFS
{
    String name = "Spark 6.0";
    Course()
    {
        //super()

        System.out.println("Course Default Constructor...");
    }

    Course(String name){
//        super()
        this();
        System.out.println("Parameterized Constructor...");
    }

    void showName(){
        System.out.println(name); //current class
        System.out.println(this.name); //current class
        System.out.println(super.name); //parent class

    }
}

public class CourseTest {

    static void main(String[] args) {
        Course course = new Course("Spark 6.0: java full stack");

    }
}
