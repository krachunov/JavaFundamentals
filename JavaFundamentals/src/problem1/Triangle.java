package problem1;

public class Triangle extends PlaneShape {
	Vertices2D a;
	Vertices2D b;
	Vertices2D c;

	private double ab;
	private double bc;
	private double ca;

	public Triangle(int aX, int aY, int bX, int bY, int cX, int cY) {
		this.type = this.getClass().toString();
		this.a = new Vertices2D(aX, aY);
		this.b = new Vertices2D(bX, bY);
		this.c = new Vertices2D(cX, cY);

		ab = distanceBetweenTwoVertices(a, b);
		bc = distanceBetweenTwoVertices(b, c);
		ca = distanceBetweenTwoVertices(c, a);
	}

	@Override
	public double getPerimeter() {
		double perimeter = ab + bc + ca;
		return perimeter;
	}

	@Override
	public double getArea() {
		// (bc*height)/2
		return 0;
	}

	@Override
	public String toString() {
		return "Type: " + this.type + "\nVertices A/" + this.a
				+ "\nVertices B/" + this.b + "\nVertices C/" + this.c
				+ "\nparamiter: " + getPerimeter() + "\nArea: " + getArea();
	}
}
