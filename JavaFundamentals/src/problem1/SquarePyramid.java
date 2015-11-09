package problem1;

public class SquarePyramid extends SpaceShape {
	Vertices3D vertex;
	double baseWidth, pyramidHeight;

	public SquarePyramid(Vertices3D vertex, double baseWidth,double pyramidHeight) {
		this.type = this.getClass().toString();
		this.vertex = vertex;
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
	

}
