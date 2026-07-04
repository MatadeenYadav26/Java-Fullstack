class Student 
{
	// they are assigned default values
	int age;
	String name;
	String course;
	
	
	void(){
	// jo variable inside method hoga usko bolege local variable, lekin unko memory me koi default memory nahi milti.
	// They are not assinged any default values.
	int age;
	String name;
	String course;
				System.out.println("Student is Studying!");
	}
}


public class  TestClass
{
	public static void main(String[] args){
	Student s = new Student(); // object creation
	}
}