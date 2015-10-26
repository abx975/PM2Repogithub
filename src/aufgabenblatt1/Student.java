package aufgabenblatt1;

import java.util.List;

public class Student implements Comparable<Student> {

	/**
	 * Speichert den Vornamen des Studenten.
	 */
	private String vorname;

	/**
	 * Speichert den Nachnamen des Studenten.
	 */
	private String name;

	/**
	 * Speichert die Matrikelnummer des Studenten.
	 */
	private int matrikelnummer;
	/**
	 * Speichert die Pruefungsleistungen eines Studenten.
	 */
	private List<Pruefungsleistung> pruefungsleistungen;

	/**
	 * Konstruiert einen Studenten mit Namen und Matrikelnumemer
	 * 
	 * @param vorname
	 *            name matrikelnummer
	 */
	public Student(String vorname, String name, int matrikelnummer,
			List<Pruefungsleistung> pruefungsleistungen) {
		super();
		this.setVorname(vorname);
		this.setName(name);
		this.setMatrikelnummer(matrikelnummer);
		this.setPruefungsleistungen(pruefungsleistungen);
	}

	/**
	 * Vergleich die Matrikelnummer von Studenten.
	 * 
	 * @param other
	 *            ist ein student.
	 */
	@Override
	public int compareTo(Student other) {
		if (getMatrikelnummer() > other.getMatrikelnummer()) {
			return 1;
		} else if (getMatrikelnummer() < other.getMatrikelnummer()) {
			return -1;
		} else {
			return 0;
		}
	}

	/**
	 * Gibt den Vornamen zurück.
	 * 
	 * @return liefert den Vornamen zurück.
	 */

	public String getVorname() {
		return vorname;
	}

	/**
	 * Setzt den Vornamen.
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * Gibt den Nachnamen zurück.
	 * 
	 * @return liefert den Namen zurück.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setzt den Namen.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gibt die Matrikelnummer zurück.
	 * 
	 * @return liefert die Matrikelnummer zurück.
	 */
	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	/**
	 * Setzt die Matrikelnummer.
	 */
	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	/**
	 * Gibt die pruefungsleistungen zurück.
	 * 
	 * @return liefert die pruefungsleistungen zurück.
	 */
	public List<Pruefungsleistung> getPruefungsleistungen() {
		return pruefungsleistungen;
	}

	/**
	 * Setzt die pruefungsleistungen.
	 */
	public void setPruefungsleistungen(
			List<Pruefungsleistung> pruefungsleistungen) {
		this.pruefungsleistungen = pruefungsleistungen;
	}

	/**
	 * Vergleicht die Studenten nach der Matrikelnummer.
	 * 
	 * @param other
	 *            der student der verglichen wird.
	 * @return liefert zurück ob die Studenten gleich sind.
	 */

	public boolean equals(Student other) {
		return getMatrikelnummer() == other.getMatrikelnummer();
	}

	/**
	 * Setzt den hashCode auf Matrikelnummer.
	 * 
	 * @return gibt Matrikelnummer zurück
	 * 
	 */
	@Override
	public int hashCode() {
		return getMatrikelnummer();
	}

	/**
	 * Wandelt die Studenten in einen String.
	 * @return String der einen Student Repraesentiert.
	 */
	public String toString() {
		return (this.getName() + "," + this.getVorname());
	}
}