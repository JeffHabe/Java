package Q37;

public class q37 {
		private boolean flag=true;

		public void displaySeries() {
			int num = 2;
			System.out.print(flag);
			while (flag) {
				if (num % 7 == 0) {
					flag = false;
				}
				System.out.print(" "+num);
				num += 2;
			}
		}

		public static void main(String[] args) {
			
			new q37().displaySeries();
			
		}
	}

