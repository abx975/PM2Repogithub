package aufgabenblatt1;

public interface Liste<Typ extends Comparable<Typ>> {
	void hinzufuegen(Typ element);
	Typ get(int index);
	void entfernen(Typ element);
	void entferneElementAnIndex(int index);
	int getAnzahlElemente();
	String toString();
	Typ getKleinstesElement();
}