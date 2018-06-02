package Q65;

public class q65 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
//		 String str2 = new String(str1);
//		 String str2 = sb1.toString();
//		 String str2 = "Duke";
		String str2 = str1;
		System.out.println(str1==str2);
		System.out.print(str1.equals(str2));
	}

}
