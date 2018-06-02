package Q51;

public class q51 {
		static void dispResult(int[] num) {
			try {
				System.out.println(num[1] / (num[1] - num[2]));
			} catch (ArithmeticException e) {
				System.err.println("first exception");
			}
			System.out.println("Done");
		}

		public static void main(String[] args) {
			try {
				int[] arr = { 100, 100 };
				dispResult(arr);
			} catch (IllegalArgumentException e) {
				System.err.println("second exception");
			} catch (Exception e) {
				System.err.println("third exception");
			}
		}
	}

