import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String fname = new String(sc.next());

		String lname = new String(sc.next());

		int year = sc.nextInt();

		person p = new person(fname, lname, year);
		p.display();
	}
}
