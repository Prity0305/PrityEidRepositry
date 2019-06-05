package polymorphism;

public class A {
	protected int i;
	static void m1() {
		System.out.println("Inside A's m1 method");
	}

	final void m2() {
		System.out.println("Inside A's m2 method");
	}

	void m3() {
		System.out.println("Inside A's m3 method");
	}
	
	
	 Object m4() {
		System.out.println("Inside A's m4 method");
		return 0;
	}
}
