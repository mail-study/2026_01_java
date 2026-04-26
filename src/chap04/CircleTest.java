package chap04;

class Circle {
	private final String name;
	private final double x, y, radius;

	public Circle(String name, double x, double y, double radius) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void	 show() {
		System.out.println(name + "(" + x + "," + y + " " + radius + ")");
	}

	public double getRadius() {
		return radius;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		Circle circles[] = {
				new Circle("c1", 1, 2, 3),
				new Circle("c2", 1.1, 2.2, 3.3),
				new Circle("c3", 3, 2, 1),
		};

		for (var c : circles)
			c.show();

		Circle maxCircle = circles[0];

		for (var c : circles) {
			if (c.getRadius() > maxCircle.getRadius()) {
				maxCircle = c;
			}
		}

		System.out.print("The largest circle: ");
		maxCircle.show();
	}
}