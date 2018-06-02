
public class Circle extends Point {
	private double radius;

	/** ���غc���|�� x,y �M radius �ܼƪ�l�� **/
	public Circle(int x, int y, double radius) {
		super(x, y);
		super.name = "Circle";
		this.radius = radius;
	}

	@Override
	public double getArea() {
		/**
		 * Math.pow �Ψӭp�⦸��ƪ�API������k Math.PI �ϥ�Java �w�]�bMath API ����PI ��
		 **/
		double area = (Math.pow(radius, 2)) * Math.PI;// �p�⭱�n

		return area;
	}

	public String toString() {
		String strCir = super.toString() + " is the center and the radius is " + radius;
		return strCir;

	}
}
