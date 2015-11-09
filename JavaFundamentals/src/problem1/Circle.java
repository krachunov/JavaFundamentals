package problem1;

public class Circle extends PlaneShape {
	String type;
	Vertices2D vertex;
	double radius;

	public Circle(int aX, int aY, double radius) {
		this.type = this.getClass().toString();
		this.vertex = new Vertices2D(aX, aY);
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {

		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		// PI*r^2
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Type: " + this.type + "\nVertices A/" + this.vertex
				+ "\nparamiter: " + getPerimeter() + "\nArea: " + getArea();
	}

}
