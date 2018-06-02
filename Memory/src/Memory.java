import java.util.Date;

import javax.xml.crypto.Data;

public class Memory {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		 Data date = new Data(12, 31, 1999);
		System.out.println(MemoryUtil.memoryUsageOf(date));
		System.out.println(MemoryUtil.memoryUsageOf(s));
		System.out.println(MemoryUtil.deepMemoryUsageOf(s));

	}

}
