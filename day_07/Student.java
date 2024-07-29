public class Student {
	private String name;
	private int year;
	private static String school_name = new String("Havard University");

	Student(){
		this.name = new String("");
		this.year = 0;
	}

	Student(String name, int year){
		this.name = new String(name);
		this.year = year;
	}

	void display(){
		System.out.println("Name: " + this.name);
		System.out.println("Year: " + this.year);
		System.out.println("School name: " + school_name);
	}
}
