class A {
// khoi static
	static {
		System.out.println("Static!");
	}
}
public class Main {

	static {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	public static void main(String args[]){
	Student t1 = new Student("Hoang", 10);
	Student t2 = new Student("John", 23);
	Student t3 = new Student();

	t1.display();
	t2.display();
	t3.display();

	A a = new A();
	}
}
