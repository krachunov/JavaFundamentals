package problem1;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable,
		VolumeMeasurable {
	List<Vertices3D> listOfVerices;
}
