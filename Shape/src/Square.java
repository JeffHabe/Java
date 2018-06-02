
public class Square extends Point {
	private double width;

	/** ���غc���|�� x,y �M width �ܼƪ�l�� **/
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
