package Q28;

import java.util.ArrayList;
import java.util.List;

public class q28 {

	public static class Patient {
		String name;

		public Patient(String name) {
			this.name = name;
		}
	}

		public static void main(String[] args) {
			List<Patient>  ps = new ArrayList<Patient>();
			Patient p2 = new Patient("Mike");
//			ps.add(new Patient("Tom"));
			ps.add(p2); 
			// insert code here
			int f = ps.indexOf(p2);
			if (f >= 0) {
				System.out.println(f);
				System.out.print("Mike Found");
			}
		}
	}

