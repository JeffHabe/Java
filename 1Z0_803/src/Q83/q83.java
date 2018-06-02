package Q83;

public class q83 {

	public static void Main(String[] args)  {
		// TODO 自動產生的方法 Stub
		Candidate c;
		try {
			c = new Candidate("James", 20);
		
		Candidate c1 = new Candidate("Williams", 32);
		System.out.println(c);
		System.out.println(c1);
//		}catch (Exception e) {
//		// TODO 自動產生的 catch 區塊
//		e.printStackTrace();

		} catch (MissingInfoException e1) {
			// TODO 自動產生的 catch 區塊
			e1.printStackTrace();
		
		} catch (AgeOutofRangeException e2) {
		// TODO 自動產生的 catch 區塊
			e2.printStackTrace();
		
		}catch (Exception e) {
//		 TODO 自動產生的 catch 區塊
		e.printStackTrace();
	
	}
	
	}
}

class MissingInfoException extends Exception {
}

class AgeOutofRangeException extends Exception {
}

class Candidate {
	String name;
	int age;

	Candidate(String name, int age) throws Exception{
		if (name == null) {
//			throw new MissingInfoException();
		} else if (age <= 10 || age >= 150) {
//			throw new AgeOutofRangeException();
		} else {
			this.name = name;
			this.age = age;
		}
	}

	public String toString() {
		return name + " age: " + age;
	}
}