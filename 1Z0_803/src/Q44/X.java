package Q44;

public  class X implements Z {
		public String toString() {
			return "X ";
		}

		public static void main(String[] args) {
//			Z myX=  new X();
//			System.out.print((Z)myX);
			
			Y myY = new Y();
			
			X myX = myY;
			Z myZ = myY;
			System.out.print(myX);
			System.out.print((Y)myX);
			System.out.print(myZ);
		}
	}

	 class Y extends X {
		public String toString() {
			return "Y ";
		}
	}
