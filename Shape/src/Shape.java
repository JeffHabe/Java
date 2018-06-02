
import java.text.DecimalFormat;

public abstract class Shape {
	protected String name;

	public abstract double getArea();

	// �⹳��k,�Ψ����O�����O�i���@
	DecimalFormat df = new DecimalFormat("##.00");

	// �ϥ�Format ����p���I����
	public String toString() {// �⹳���O������@��k,��toString ��@�T�w����X���G
		String ShapeName = "Shape name = " + this.name + " ,Area = " + df.format(getArea());
		return ShapeName;
	}
}
