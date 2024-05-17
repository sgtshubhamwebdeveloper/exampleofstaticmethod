package exampleofkeywrds;

public class Test {
	int multiply(int a,int b) {
		return a*b;
	
	}
	static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Test a = new Test();
		System.out.println("5*5=" + a.multiply(5,5));
		System.out.println("2+2=" + Test.add(2,2));
		

	}

}
