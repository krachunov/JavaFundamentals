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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
