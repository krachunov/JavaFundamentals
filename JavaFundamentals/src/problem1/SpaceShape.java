package problem1;

import java.util.List;

public abstract class SpaceShape extends MyShape implements AreaMeasurable,
		VolumeMeasurable {
	List<Vertices3D> listOfVerices;
}
