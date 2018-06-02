package Q004;

class A {
	int x;

	A() {
		System.out.println("A " + x);
	}
}

public class B extends A {
	B() {
		//有一個隠藏的super();
		
		x++;
		super.x = this.x;
		System.out.println("B " + x);
	}

	B(int y) {
		this();
		this.x = y;
		System.out.println("B2 " + x);
	}

	public static void main(String[] args){
		new B(200);
}
}