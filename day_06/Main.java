// class final
/*
final class Vehicle {
	-> khong the duoc ke thua boi lop khac
}
*/

class Bike {
}

class Animal {
	final void sound(){
	System.out.println("sound");
	}
}

class Dog extends Animal {
	/*
	void sound(){ -> phuong thuc nay khong the bi ghi de
	System.out.println("Gau gau");
	}
	*/
}

public class Main {
	public static void main(String args[]){
		// vi du bien final
		final int MAX = 10;
		System.out.println(MAX);
		// MAX = 20; -> khong the thay doi gia tri cua MAX
		Dog d = new Dog();
		d.sound();

		Bike b = new Bike();
		System.out.println(b);
	}
}
