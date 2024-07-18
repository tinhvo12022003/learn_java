import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = new String(sc.next());
		String address = new String(sc.next());
		int age = sc.nextInt(); sc.next();
		String grade = new String(sc.next());
		double score = sc.nextDouble();
		sc.next();
		Student t = new Student(name, address, age, grade, score);
		t.display();
	}
}
