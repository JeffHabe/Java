package Q20;

public class q20 {
	int sum = 0;

	public void doCheck(int number) {
		if (number % 2 == 0) {
//			break;
//		} else {
			for (int i = 0; i < number; i++) {
				sum += i;
			}
		}
	}

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		q20 obj = new q20();
		System.out.println("Red " + obj.sum);
		obj.doCheck(2);
		System.out.println("Orange " + obj.sum);
		obj.doCheck(3);
		System.out.println("Green " + obj.sum);
	}

}
//