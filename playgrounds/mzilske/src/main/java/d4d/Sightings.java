package d4d;

import java.util.Iterator;
import java.util.List;

public class Sightings {
	
	public Sightings(List<Sighting> sightings) {
		this.sightings = sightings.iterator();
	}

	Iterator<Sighting> sightings;

}
