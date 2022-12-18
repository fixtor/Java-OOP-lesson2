package Task0;

public class SquareShape implements Shape {
	private float side;

	public SquareShape(float side) {
		this.side = side;
	}

	@Override
	public float getArea() {
		return side * side;
	}

	@Override
	public float getPerimeter() {
		return side * 4;
	}

	@Override
	public String toString() {
		return "SquareShape{" +
				"side=" + side +
				"} " + super.toString();
	}
}
