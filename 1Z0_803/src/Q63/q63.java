
package Q63;

public class q63 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Student s1 = new Student ();
		Student s2 = new Student ();
		Student s3	 = new Student ();
		System.out.println("S1 "+s1);
		System.out.println("S2 "+s2);
		System.out.println("S3 "+s3);
		System.out.println();
		s1 = s3;
		System.out.println("S1 "+s1);
		System.out.println();
		s3 = s2;
		System.out.println("S3 "+s3);
		System.out.println();
		s2 = null;
		System.out.println("S1 "+s1);
		System.out.println("S2 "+s2);
		System.out.println("S3 "+s3);
	}

}

class Student {
	String name;
	int age;
}