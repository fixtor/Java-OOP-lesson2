package Task0;
public class CircleShape implements Shape {
	private float radius;

	public CircleShape(float radius) {
		this.radius = radius;
	}

	@Override
	public float getArea() {
		return (float) (radius * radius * Math.PI);
	}

	@Override
	public float getPerimeter() {
		return (float) (2 * Math.PI *radius);
	}

	@Override
	public String toString() {
		return "CircleShape{" +
				"radius=" + radius +
				"} " + super.toString();
	}
}
