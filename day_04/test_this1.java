import java.util.Scanner;
public class test_this1 {
	private String fname = new String("");
	private String lname = new String("");
	private int year = 0;

	test_this1(){
		this.fname = new String(""); // this truy cap den bien cua lop hien tai
		this.lname = new String("");
		this.year = 0;
	}

	test_this1(String fname, String lname){
		this.fname = new String(fname);
		this.lname = new String(lname);
	}

	test_this1(String fname, String lname, int year){
		this(fname, lname); // this goi lai constructor
		this.year = year;
	}

	public void display(){
		System.out.println("Last name: " + this.lname);
		System.out.println("First name: " + this.fname);
		System.out.println("Year: " + this.year);
	}

	public void input(){
		Scanner sc = new Scanner(System.in);
		String fname = new String(sc.nextLine());
		String lname = new String(sc.nextLine());
		int year = sc.nextInt();
		sc.nextLine();

		test_this1 t1 = new test_this1(fname, lname, year);
		t1.display(); // this su dung de goi lam cua lop hien tai
		sc.close();
	}

}
