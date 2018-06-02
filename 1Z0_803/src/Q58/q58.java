package Q58;

public class q58 {

	public static void main(String[] args) {
		q58 t = new q58();
		try {
			t.doPrint();
			t.doList();
		} catch (Exception e2) {
			System.out.println("Caught " + e2);
		}
	}

	public void doList() throws Exception {
		throw new Error("Error");
	}

	public void doPrint() throws Exception {
		throw new RuntimeException("Exception");
	}
}
