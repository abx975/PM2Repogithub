package Aufgabenblatt01;

import java.util.Comparator;

public class sortName {

	/**
	 * Sortierung nach Name
	 */

	public class SortName implements Comparator<Student> {

		@Override
		public int compare(Student stud1, Student stud2) {

			String nachname1 = stud1.getNachname();
			String nachname2 = stud2.getNachname();
			String vorname1 = stud1.getVorname();
			String vorname2 = stud2.getVorname();
			if (vorname1.compareTo(vorname2) == 0) {
				return nachname1.compareTo(nachname2);
			} else {
				return vorname1.compareTo(vorname2);
			}
		}
	}
}

