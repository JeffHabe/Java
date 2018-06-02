package Q77;

	class Caller {
//		private void init(){
		protected void init() {
			System.out.println("Initialized");
		}

		public void start() {
			init();
			System.out.println("Started");
		}
	}

	public class q77 {
		public static void main(String[] args) {
			Caller c = new Caller();
			c.start();
			c.init();
		}
	}
