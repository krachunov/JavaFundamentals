package problem1;

public class Shape {
	public double distanceBetweenTwoVertices(Vertices2D a, Vertices2D b) {
		return Math.sqrt((Math.pow((a.getX() - b.getX()), 2) + Math.pow(
				(a.getY() - b.getY()), 2)));

	}

	
}
