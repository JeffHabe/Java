
import java.text.DecimalFormat;

public abstract class Shape {
	protected String name;

	public abstract double getArea();

	// 抽像方法,用來讓別的類別進行實作
	DecimalFormat df = new DecimalFormat("##.00");

	// 使用Format 取後小數點後兩位
	public String toString() {// 抽像類別中的實作方法,讓toString 實作固定的輸出結果
		String ShapeName = "Shape name = " + this.name + " ,Area = " + df.format(getArea());
		return ShapeName;
	}
}
