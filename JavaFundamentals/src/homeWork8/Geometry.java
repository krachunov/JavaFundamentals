/**
 * Problem 1.	Geometry
Define a class structure that models a shape hierarchy.
	Shape – base class for any kind of shape, holds a list of vertices
	PlaneShape – base class for all plane (2D) shapes, holds a list of 2D vertices (holding x and y), implements PerimeterMeasurable and AreaMeasurable interfaces
Triangle – holds 3 vertices
Rectangle – holds 1 vertex, width, height
	Circle – holds 1 vertex and radius
	SpaceShape – base class for all three-dimensional shapes, holds a list of 3D vertices (holding x, y and z), implements AreaMeasurable and VolumeMeasurable interfaces
	Square Pyramid – holds 1 vertex (base center), base width, pyramid height
	Cuboid – holds 1 vertex, width, height, depth
	Sphere – holds 1 vertex and radius

 */
package homeWork8;

import problem1.Triangle;

public class Geometry {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(0, 0, 0, 5, 10, 9);
		System.out.println(triangle.toString());
	}
}
