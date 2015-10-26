package aufgabenblatt1;

/**
 * Klasse die Prüft ob das erste Element eine zahl ist.
 * 
 * @author Nils Eggebrecht, Eduard Veit
 *
 */
public class Pruefungsleistung {

	private String modulname;
	private int note;

	/**
	 * Erstellt Prüfungsleistung
	 * 
	 * @param modulname
	 *            , note sind die Daten die eine Pruefungsleistung
	 *            repraesentiert.
	 */
	public Pruefungsleistung(String modulname, int note) {
		super();
		this.setModulname(modulname);
		this.setNote(note);
	}

	/**
	 * gibt den Modulnamen zurück
	 * 
	 * @return liefert modulname zurück.
	 */
	public String getModulname() {
		return modulname;
	}
	/**
	 * setzt den Modulnamen
	 *
	 */
	public void setModulname(String modulname) {
		this.modulname = modulname;
	}
	/**
	 * gibt die Note zurück
	 * 
	 * @return liefert die Note zurück.
	 */
	public int getNote() {
		return note;
	}
	/**
	 * setzt die Note
	 */
	public void setNote(int note) {
		this.note = note;
	}

}