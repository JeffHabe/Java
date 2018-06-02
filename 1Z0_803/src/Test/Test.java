package Test;

public class Test {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(i);
			if (true) {
				continue;
			}
			// continue go to while(...) statement;
		} while (i++ < 10);
		System.out.println(28+""+(5 <= 4)+29);
		System.out.println(28+5 <= 4+29);
		System.out.println(28+"5" +"<="+ "4"+29);
		System.out.println((28 + 5) <= (4 + 29));
	}
}
