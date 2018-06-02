package Q38;

public class q38 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		String[] colors = { "red", "blue", "green", "yellow", "maroon", "cyan" };
		for (String c : colors) {
			if (c.length() != 4) {
				
				continue;
			}
			System.out.print(c + ", ");
			
		}
	}

}
