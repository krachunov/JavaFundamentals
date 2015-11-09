package problem1;

public class Sphere extends SpaceShape {
	Vertices3D vertex;
	double radius;

	public Sphere(Vertices3D vertex, double radius) {
		this.type = this.getClass().toString();
		this.vertex = vertex;
		this.radius = radius;

	}

	@Override
	public double getArea() {

		return 4 * Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getVolume() {

		return (4 / 3) * Math.PI * Math.pow(radius, 3);
	}

	@Override
	public String toString() {
		return "Type: " + this.type + "\nVertices A/" + this.vertex
				+ "\nvolume: " + getVolume() + "\nArea: " + getArea();
	}
}
