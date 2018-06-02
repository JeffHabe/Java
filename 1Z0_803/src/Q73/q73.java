package Q73;

public class q73 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		float myarray[] = { 10.20f, 20.30f, 30.40f, 50.60f };
		int index = 0;
		Boolean isFound = false;
		float key = 30.40f;
		// while (key == myarray[index++]) {
		// isFound = true;
		// }
		// while (index <= 4) {
		// if (key == myarray[index]) {
		// index++;
		// isFound = true;
		// break;
		// }
		// }
		while (index++ < 5) {
			if (key == myarray[index]) {
				isFound = true;
				break;
			}
		}
		System.out.println(isFound);
	}
}
