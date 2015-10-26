package aufgabenblatt1;
/**
 * Das Interface für die Klasse ArrayListe
 * 
 * @author Nils Eggebrecht, Eduard Veit
 * @version 1.0
 */
public interface Liste<Typ extends Comparable<Typ>> {
	void hinzufuegen(Typ element);
	Typ get(int index);
	void entfernen(Typ element);
	void entferneElementAnIndex(int index);
	int getAnzahlElemente();
	String toString();
	Typ getKleinstesElement();
	int berechneSummeInteger();
}