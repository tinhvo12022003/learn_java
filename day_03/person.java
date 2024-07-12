public class person {
	private String fname;
	private String lname;
	private int year;

//constructor khong tham so

	person(){
		this.fname = new String("");
		this.lname = new String("");
		this.year = 1990;
	}

//constructor co tham so
	person(String fname, String lname, int year) {
		this.fname = new String(fname);
		this.lname = new String(lname);
		this.year = year;
	}

	void display(){
		System.out.println("first name: " + this.fname);
		System.out.println("last name: " + this.lname);
		System.out.println("Year " + this.year);
	}
}
