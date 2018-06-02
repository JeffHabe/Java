
public class Lab7 {

	public static void main(String[] args) {
		Shape[] graphics = new Shape[4];// «Ø
		graphics[0] = new Point(5, 3);
		graphics[1] = new Circle(5, 3, 12);
		graphics[2] = new Square(5, 3, 5);
		graphics[3] = new Rectangle(5, 3, 4, 3);
		for (int i = 0; i < graphics.length; i++) {
			graphics[i].toString();
			System.out.println(graphics[i]);
		}
	}

}
