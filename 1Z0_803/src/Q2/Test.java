package Q2;

import java.awt.List;

public class Test {

	public static List data = new List();
	
	static List update ( String[ ] strs )
	{
		for (String x : strs) {
			data.add(x);
		}
		return data;
	}

	public static void main(String[] args) {
		String[] d = { "a", "b", "c" };
		update(d);
		for (String s : d) {
			System.out.print(s + " ");
		}
	}

}
