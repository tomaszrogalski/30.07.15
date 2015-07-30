package zadanie2;

public class A {

	public static void main(String[] args) {
		A obj = new B();
	}

	public A() {
		System.out.print("1");
		methodOne();
		methodOne2();
	}

	public void methodOne() {
		System.out.print("Nie wykona");
	}

	public void methodOne2() {
		System.out.print("3");
	}
}

class B extends A {
	public B() {
		System.out.print("4");
	}

	public void methodOne() {
		System.out.print("2");
	}

}
