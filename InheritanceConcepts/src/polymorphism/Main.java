package polymorphism;

public class Main {

	public static void main(String args[]) {
		B a = new B();
		//a.m1(); // static
		//a.m3(); // Non - static

		A ref;
		ref = a;
		
		ref.m1();
		ref.m3();

	}

}
