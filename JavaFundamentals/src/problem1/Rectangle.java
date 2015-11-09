package problem1;

public class Rectangle extends PlaneShape {
	Vertices2D vertex;
	double width, height;

	public Rectangle(int aX, int aY, double width, double height) {
		this.type = this.getClass().toString();
		this.vertex = new Vertices2D(aX, aY);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public double getArea() {

		return (width * height);
	}

	@Override
	public String toString() {
		return "Type: " + this.type + "\nVertices A/" + this.vertex
				+ "\nparamiter: " + getPerimeter() + "\nArea: " + getArea();
	}
}
