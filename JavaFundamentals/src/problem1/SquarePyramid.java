package problem1;

public class SquarePyramid extends SpaceShape {
	Vertices3D vertex;
	double baseWidth, pyramidHeight;

	public SquarePyramid(int x, int y, int z, double baseWidth,
			double pyramidHeight) {
		this.type = this.getClass().toString();
		this.vertex = new Vertices3D(x, y, z);
		this.baseWidth = baseWidth;
		this.pyramidHeight = pyramidHeight;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Type: " + this.type + "\nVertices A/" + this.vertex
				+ " baseWidth: " + this.baseWidth + "height: "
				+ this.pyramidHeight + "\nvolume: " + getVolume() + "\nArea: "
				+ getArea();
	}

}
