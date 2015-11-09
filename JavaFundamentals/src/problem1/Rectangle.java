package problem1;

public class Rectangle extends PlaneShape {
	String type;
	Vertices2D x;
	double width, height;

	public Rectangle(int aX, int aY, double width, double height) {
		this.type = this.getClass().toString();
		this.x = new Vertices2D(aX, aY);
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
		return "Type: " + this.type + "\nVertices A/" + this.x
				+ "\nparamiter: " + getPerimeter() + "\nArea: " + getArea();
	}
}
