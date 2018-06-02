
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int num = 1000;
		int a[] = new int[num];
		MyTrashCan can = new MyTrashCan();
		Random Int_Number = new Random();
		long program_start_time = System.currentTimeMillis();
		long insert_start_time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			can.Insert(Int_Number.nextInt(50));
		}
		long insert_end_time = System.currentTimeMillis();
		System.out.println("輸入程式執行共花了 : " + String.valueOf((insert_end_time - insert_start_time) / 1000f) + "秒。");
		long toString_start_time = System.currentTimeMillis();
		String str = can.ToString();
		System.out.println(str);
		long toString_end_time = System.currentTimeMillis();
		System.out.println("排序程式執行共花了 : " + String.valueOf((toString_end_time - toString_start_time) / 1000f) + "秒。");
		long empty_start_time = System.currentTimeMillis();
		can.Empty();
		long empty_end_time = System.currentTimeMillis();
		System.out.println("empty程式執行共花了 : " + String.valueOf((empty_end_time - empty_start_time) / 1000f) + "秒。");
		long program_end_time = System.currentTimeMillis();
		System.out.println("程式執行共花了 : " + String.valueOf((program_end_time - program_start_time) / 1000f) + "秒。");
	}

}

