package Task0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Shape> shapes = Arrays.asList(new SquareShape(10f),
										new SquareShape(5f),
										new SquareShape(2f),
										new CircleShape(10f),
										new CircleShape(5f),
										new CircleShape(2f)
		);

		for(Shape shape: shapes) {
			System.out.printf("%s area=%f perimeter=%f\n", shape, shape.getArea(), shape.getPerimeter());
		}
	}
}
