package Q90;

public class q90 {
	static int speed = 10;
	static int weight;
//	int weight;
	String a;
	public static void doAnything(int x) {
//		weight = ++x;
		weight=++x;
		speed++;
//		a="33";
	}

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		q90 obj = new q90();
//		obj.doAnything(speed);
		q90.doAnything(speed);
		System.out.println(speed + " " + obj.weight);
		q90.doAnything(speed);
		System.out.println(speed + " " + obj.weight);

	}

}
