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

import java.util.ArrayList;
import java.util.List;

import problem1.Circle;
import problem1.Cuboid;
import problem1.MyShape;
import problem1.Rectangle;
import problem1.Sphere;
import problem1.SquarePyramid;
import problem1.Triangle;

public class Geometry {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(0, 0, 0, 5, 10, 9);
		Rectangle rectangle = new Rectangle(0, 0, 10, 5);
		Circle circle = new Circle(0, 0, 1.5);
		SquarePyramid squarePyramid = new SquarePyramid(0, 0, 0, 4, 8);
		Cuboid cuboid = new Cuboid(0, 0, 0, 10, 15, 5);
		Sphere sphere = new Sphere(0, 0, 0, 1.5);

		List<MyShape> shapes = new ArrayList<>();
		shapes.add(triangle);
		shapes.add(rectangle);
		shapes.add(circle);
		shapes.add(squarePyramid);
		shapes.add(cuboid);
		shapes.add(sphere);

		for (MyShape myShape : shapes) {
			System.out.println("---------------");
			System.out.println(myShape.toString());
		}

	}
}
