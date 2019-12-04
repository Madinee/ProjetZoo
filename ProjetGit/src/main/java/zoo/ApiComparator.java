package zoo;

import java.util.Comparator;

public class ApiComparator implements Comparator<Secteur> {

	public int compare(Secteur s1, Secteur s2) {		
		return s1.getNombreAnimaux()-s2.getNombreAnimaux();
	}

}
