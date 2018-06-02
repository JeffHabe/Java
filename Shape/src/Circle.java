
public class Circle extends Point {
	private double radius;

	/** 此建構式會把 x,y 和 radius 變數初始化 **/
	public Circle(int x, int y, double radius) {
		super(x, y);
		super.name = "Circle";
		this.radius = radius;
	}

	@Override
	public double getArea() {
		/**
		 * Math.pow 用來計算次方數的API中的方法 Math.PI 使用Java 預設在Math API 中的PI 值
		 **/
		double area = (Math.pow(radius, 2)) * Math.PI;// 計算面積

		return area;
	}

	public String toString() {
		String strCir = super.toString() + " is the center and the radius is " + radius;
		return strCir;

	}
}
