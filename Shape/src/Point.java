
public class Point extends Shape{//�~��Shape �ù�@Shape������k 
	protected int x,y;
	
	/** ���غc���|�� x �M y �ܼƪ�l�� **/
	public Point(int x,int y){
		super.name = "Point";//super.name �O�ϥΤ����O�����name,�ó]�w��Point
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
