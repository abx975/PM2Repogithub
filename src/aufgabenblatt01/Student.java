package aufgabenblatt01;
import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse repraesentiert die Studenten.
 * 
 * @author Nils Eggebrecht, Eduard Veit
 * @version 1.0
 */

public class Student implements Comparable<Student> {

	String vorname;
	String nachname;
	int matrikelnummer;
	List<String> Prüfungsleistungen = new ArrayList<String>();
	Pruefungsleistung pruefungsleistung;

	public Student(String vorname, String nachname, int matrikelnummer,
			Pruefungsleistung pruefungsleistung) {
	}
	 
	@Override
	public int compareTo(Student stud) {
		return Integer.compare(this.matrikelnummer, stud.matrikelnummer);
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}
}
