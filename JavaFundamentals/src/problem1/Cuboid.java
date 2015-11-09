package problem1;

public class Cuboid extends SpaceShape {

	Vertices3D vertex;
	int width, height, depth;

	public Cuboid(Vertices3D vertex, int width, int height, int depth) {
		this.type = this.getClass().toString();
		this.vertex = vertex;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	@Override
	public double getArea() {
		return 2 * (width * height) + 2 * (height * depth) + 2
				* (width * depth);
	}

	@Override
	public double getVolume() {
		return width * height * depth;
	}

	@Override
	public String toString() {
		return "Type: " + this.type + "\nVertices A/" + this.vertex
				+ " width: " + this.width + "height: " + this.height
				+ " depth: " + this.depth + "\nvolume: " + getVolume()
				+ "\nArea: " + getArea();
	}
}
