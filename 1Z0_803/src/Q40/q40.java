package Q40;

public class q40 {

		public static String doMsg(char x) {
			return "Good Day!";
		}

		public static String doMsg(int y) {
			return "Good Luck!";
		}

		public static void main(String[] args) {
			char x = 8;
			int z = '8';
			System.out.println(x+" "+ z);
			System.out.println(doMsg(x));
			System.out.print(doMsg(z));
		}
	}
