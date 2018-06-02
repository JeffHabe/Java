package Q49;

class Mid {
	public int findMid(int n1, int n2) {
		return (n1 + n2) / 2;
	}
}

public class Calc extends Mid {
	public static void main(String[] args) { 
		int n1 = 22, n2 = 2; 
		// insert code here System.out.print(n3); } }
//		Calc c = new Calc();
//		int n3=c.findMid(n1, n2);

		Mid m1 =new Calc();
		Calc c1 = (Calc)m1;
		int n3=c1.findMid(n1, n2);
		System.out.print(n3);
	}

	}
