package Q1;

public class Q01 {
	public class Circle {
		double radius;
		
		public class App {
			public void main(String[] args) {
				Circle c1 = new Circle(17.4);
				System.out.println(c1.getArea());
			}
		}
		public Circle(double r) {
			radius = r;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double r) {
			radius = r;
		}

		public double getArea() {
			return  Math.PI * radius*radius;
		}

		
	}
}
