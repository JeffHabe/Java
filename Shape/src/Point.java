
public class Point extends Shape{//繼承Shape 並實作Shape中的方法 
	protected int x,y;
	
	/** 此建構式會把 x 和 y 變數初始化 **/
	public Point(int x,int y){
		super.name = "Point";//super.name 是使用父類別的欄位name,並設定為Point
		this.x=x;
		this.y=y;
	}
	@Override
	public double getArea() {
		return 0.0;
	}
	public String toString(){//
		String strPoint= super.toString() +"\n"+"Point = " +"("+ x +","+y+")";
		return strPoint;
	}
}
