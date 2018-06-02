
public class Square extends Point {
	private double width;

	/** 此建構式會把 x,y 和 width 變數初始化 **/
	public Square(int x, int y, double width) {
		super(x, y);
		super.name = "Square";
		this.width = width;
	}

	@Override
	public double getArea() {
		double area = Math.pow(width, 2);
		return area;
	}

	public String toString() {
		String strSqu = super.toString() + " is the upper left corner. The width is " + width;
		return strSqu;
	}
}
