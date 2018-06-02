package Q41;

public class q41 {
	public static void doChange(String sb) {
		sb.concat(" Holiday");
	}

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Sunday");
		String sb = new String("Sunday"); 
		doChange(sb);
		System.out.println(sb);
	}

}
