package exampleofkeywrds;

public class DisplayAge {
		static int age;
		
		static void display() {
			System.out.println("Static Method");
		}
	public static void main(String[] args) {
		age = 25;
		System.out.println("Age is " +age);
		display();

	}

}
