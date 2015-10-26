package aufgabenblatt1;

import java.util.Comparator;

/**
 * Diese Klasse vergleich die Namen der Studenten.
 * 
 * @author Nils Eggebrecht, Eduard Veit
 * @version 1.0
 */

public class NamensVergleicher implements Comparator<Student> {
	/**
	 * Vergleicht zwei Studenten nach Namen.
	 * 
	 * @param  s1, s2 
	 * 				liefert die Studenten die vegleicht werden sollen.
	 */
	@Override
	public int compare(Student s1, Student s2) {
		return (s1.toString().compareToIgnoreCase(s2.toString()));
	}

}