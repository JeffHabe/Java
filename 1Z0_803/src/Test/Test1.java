package Test;

public class Test1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		StringBuilder MyStringBuilder = new StringBuilder("Funday");
//		MyStringBuilder.replace(0,1, "S");
//		MyStringBuilder.delete(0,1);
		System.out.println(MyStringBuilder.charAt(0));
		MyStringBuilder.insert(0,"S");
		System.out.print(MyStringBuilder);
	}

}
