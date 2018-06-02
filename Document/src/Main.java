import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Email email = new Email();
		File file = new File();
		Main main = new Main();
		Document choice = null;
		main.Email(email);
		main.File(file);
		System.out.println("請輸入要搜找的文件(email/file),預設:email");//選擇文件與搜尋文字
		String choicStr = scr.nextLine();
		System.out.println("請輸入要搜找的文字,預設");
		String testStr = scr.nextLine();
		if ("email".equals(choicStr)) {
			choice = email;
		} else if ("file".equals(choicStr)) {
			choice = file;
		}else{
			choice=email;
		}
//		if( "".equals(testStr)){
//			testStr="0";
//		}
		Boolean tf = ContainsKeyword(choice, testStr);
		System.out.println(tf);
	}

	void Email(Email e) {
		System.out.println("收件者");
		String recipient = scr.nextLine();// 輸入你想要的資料
		System.out.println("寄件者");
		String sender = scr.nextLine();
		System.out.println("主旨");
		String title = scr.nextLine();
		e.setSender(sender);				//設定所輸入的值
		e.setRecipient(recipient);
		e.setTitle(title);
		String text = null;
		text = "我很愛JAVA 的，" + "但因為有時候是英文的題目用了很長的時候去弄懂老師的題目，" + "加上本學生以經大四了，" + "不想被當。貇求老師高台貴手";
		e.setText(text);
		System.out.println(e.toString());

		// FileWriter fWrite;
		// try {
		// fWrite = new FileWriter("email.txt");
		// fWrite.write("我很愛JAVA 的，" + "但因為有時候是英文的題目用了很長的時候去弄懂老師的題目，" +
		// "加上本學生以經大四了，" + "不想被當。貇求老師高台貴手");
		// fWrite.close();
		// } catch (IOException exp) {
		// System.out.println("Problem create files");
		// System.exit(0);
		// }
	}

	public void File(File f) {
		System.out.println("File 路徑:(如果路徑空白,則自動設定為D:\\datafile.txt)"); // 輸入你想要的路徑
		String path = scr.nextLine();
		if ("".equals(path)) {
			path = "D:\\datafile.txt";
		}
		f.setPathName(path); // 輸入你想要的路徑
		f.setText(text_Input(path)); // 從路徑內找文字檔的內容
		System.out.println(f.toString()); // 印出結果
	}

	private String text_Input(String pathName) {
		String text = null;
		Scanner input=null;
		try {
			input = new Scanner(new FileInputStream(pathName));
		} catch (FileNotFoundException e) {
			System.out.println("Problem opening files");
			System.exit(0);
		}

		while (input.hasNext()) {
			text = input.nextLine();
		}
		input.close();
		return text;
	}

	public static Boolean ContainsKeyword(Document docObject, String keyword) {
		if (docObject.toString().indexOf(keyword, 0) >= 0)
			return true;
		return false;
	}
}
