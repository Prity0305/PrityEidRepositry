package polymorphism;

public class B extends A {
	/*
	 * child method always override parent class method but, in case of of static
	 * method , which is in parent class child class overriding method cannot
	 * override the parent class method as the static method are link with class
	 * directly.
	 */
	static void m1() {
		System.out.println("Inside B's m1 method");
	}
	
	/*
	 * this code is commented as final method cannot be override.
	 */	
	/*
	 * final void m2() { System.out.println("Inside B's m2 method"); }
	 */
	
	void m3() {
		System.out.println("Inside B's m3 method");
	}
	
	 Integer m4() {
		System.out.println("Inside A's m4 method");
		return 0;
	}
}
