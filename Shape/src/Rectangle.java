
public class Rectangle extends Point {
	private double width, height;

	/** 此建構式會把 x, y, width, height 變數初始化 **/
	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		super.name = "Rectangle";
		this.height = height;
		this.width = width;

	}

	public double getArea() {
		double area = width * height;
		return area;
	}

	public String toString() {
		String strRec = super.toString() + " is the upper left corner. The width is " + width + " and the height is "
				+ height;
		return strRec;
	}

}
