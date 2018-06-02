package Q5;

public class Q5 {

		public static void main(String[] args) {
			Alpha main = new Alpha(args);
			main.main();
		}
	}
class Alpha {
	public String[] main = new String[2];

	Alpha(String[] main) {
		for (int ii = 0; ii < main.length; ii++) {
			this.main[ii] = main[ii] + 5;
		}
	}

	public void main() {
		System.out.print(main[0] + main[1]);
	}
}
