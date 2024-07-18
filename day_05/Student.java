public class Student extends Person {
	private String grade;
	private double score;

	Student(){
		super();
		this.grade = new String("");
		this.score = 0.0;
	}

	Student(String name, String address, int age, String grade){
		super(name, address, age);
		this.grade = new String(grade);
	}

	Student(String name, String address, int age, String grade, double score){
		this(name, address, age, grade);
		this.score = score;
	}

	public void display(){
		super.display();
		System.out.println("Student grade: " + this.grade);
		System.out.println("Student score: " + this.score);
	}
}
