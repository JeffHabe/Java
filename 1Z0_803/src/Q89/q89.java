package Q89;

public class q89 {
	final int A=122;
	String str = "default";

	q89(String s) {
		str = s;

	}

	void print() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		new q89("hello").print();
	}
}
