public class Person {
	private String per_name= new String("");
	private String address = new String("");
	private int age = 0;

	Person(){
		this.per_name = new String("");
		this.address = new String("");
		this.age = 0;
	}

	Person(String per_name, String address){
		this.per_name = new String(per_name);
		this.address = new String(address);
	}

	Person(String per_name, String address, int age){
		this(per_name, address);
		this.age = age;
	}

	public void display(){
		System.out.println("Person name: " + this.per_name);
		System.out.println("Person address: " + this.address);
		System.out.println("Person age: " + this.age);
	}
}
