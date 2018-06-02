package Q75;

public class q75 {

	public static void main(String[] args) {

	// TODO 自動產生的方法 Stub
	 String names[] = new String[3]; 
	 names[0] = "Mary Brown"; 
	 names[1] = "Nancy Red"; 
	 names[2] = "Jessy Orange"; 
	 try { for (String n : names) {
		 try { String pwd = n.substring(0, 5) + n.substring(6, 9); System.out.println(pwd); 
		 } catch (StringIndexOutOfBoundsException e) {
			 System.out.println("string out of limits"); 
			 }
		 } 
	 } catch (ArrayIndexOutOfBoundsException e) { 
		 System.out.println("array out of limits"); 
		 } 
	 }
}
