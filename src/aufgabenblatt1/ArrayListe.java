package aufgabenblatt1;

import java.util.Arrays;

/**
 * Diese Klasse repraesentiert die ArrayListe<T>.
 * 
 * @author Nils Eggebrecht, Eduard Veit
 * @version 1.0
 */
public class ArrayListe<Typ extends Comparable<Typ>> implements Liste<Typ> {

	/**
	 * Speichert die Anzahl der Elemente.
	 */
	int anzahlElemente;
	/**
	 * Speichert die Elemente vom Typ Typ.
	 */
	private Object[] elemente;

	/**
	 * Generiert eine Liste elemente.
	 * 
	 * @param anfangsKapazitaet
	 *            Angabe der Größe des Arrays
	 */
	public ArrayListe(int anfangsKapazitaet) {
		anzahlElemente = 0;
		elemente = new Object[anfangsKapazitaet];
	}

	/**
	 * Generiert eine Liste elemente mit der Größe 10.
	 * 
	 */
	public ArrayListe() {
		this(10); // AnfangsKapazität ist auf 10 gesetzt.
	}

	/**
	 * Fuegt der Liste ein Element hinzu.
	 * 
	 * @param element
	 *            Angabe der Größe des Arrays
	 */
	@Override
	public void hinzufuegen(Typ element) {
		sichereKapazitaetZu(anzahlElemente + 1);
		this.elemente[anzahlElemente] = element;
		anzahlElemente++;
	}


	/**
	 * vergroessert das Array
	 * 
	 * @param mindestKapazitaet
	 *            gibt die Größe des neuen Arrays an.
	 * 
	 */
	private void sichereKapazitaetZu(int mindestKapazitaet) {
		int alteKapazitaet = elemente.length;
		if (mindestKapazitaet > alteKapazitaet) {
			Object[] alteElemente = elemente;
			int neueKapazitaet = alteKapazitaet + Math.max(5, mindestKapazitaet-alteKapazitaet);
			elemente = Arrays.copyOf(alteElemente, neueKapazitaet);
		}
	}

	/**
	 * Berechnet die Summe der Zahlen, wenn die Liste eine Integer-Liste ist.
	 * 
	 * @return Summe der Zahlen aus dem Array, wenn nicht Integer dann 0.
	 */

	@Override
	public int berechneSummeInteger() {
		int summe = 0;

		for (int i = 0; i < anzahlElemente; i++) {
			if (elemente[i] instanceof Integer) {
				summe += (int) get(i);
			}
		}
		return summe;
	}

	/**
	 * Berechnet die Summe der Zahlen, wenn die Liste eine Integer-Liste ist.
	 * 
	 * @param index
	 *            liefert den Index, von dem der Typ angegeben werden soll.
	 * @return Summe der Zahlen aus dem Array, wenn nicht Integer dann 0.
	 */
	@Override
	public Typ get(int index) {
		if (index >= getAnzahlElemente()) {
			throw new IndexOutOfBoundsException();
		}
		return (Typ) elemente[index];
	}

	/**
	 * Entfernt alle Elemente die gleich dem eingabe Parameter sind.
	 * 
	 * @param element
	 *            welches entfernt werden soll.
	 * 
	 */
	@Override
	public void entfernen(Typ element) {
		for (int i = 0; i < getAnzahlElemente(); i++) {
			if (get(i).equals(element)) {
				entferneElementAnIndex(i);
			}
		}

	}

	/**
	 * Entfernt das Element an der Stelle vom Index.
	 * 
	 * @param index
	 *            gibt an welches Element entfernt werden soll.
	 * 
	 */
	@Override
	public void entferneElementAnIndex(int index) {
		if (index >= getAnzahlElemente()) {
			throw new IndexOutOfBoundsException();
		}
//		for (int i = index, k = i + 1; k < elemente.length; i++, k++) {
//			elemente[i] = elemente[k];
//		}
		
		for (int i = index; i < elemente.length-1; i++) {
			elemente[i] = elemente[i+1];
		}
		elemente[anzahlElemente - 1] = null;
		anzahlElemente--;
	}

	/**
	 * Entfernt das Element an der Stelle vom Index.
	 * 
	 * @return anzahlElemente gbt die Anzahl der Elemente im Array aus.
	 * 
	 */
	@Override
	public int getAnzahlElemente() {
		return anzahlElemente;
	}

	/**
	 * Sucht das kleinste Element im Array.
	 * 
	 * @return liefert das Kleinste Element vom Typ Typ zurück.
	 * 
	 */
	@Override
	public Typ getKleinstesElement() {
		Typ kleinstesElement = null;

		if (getAnzahlElemente() == 1) {
			kleinstesElement = get(0);
		}
		if (getAnzahlElemente() > 1) {
			kleinstesElement = (Typ) get(0);
			for (int i = 0; i < (anzahlElemente - 1); i++) {
				Typ e2 = (Typ) get(i + 1);
				if (kleinstesElement.compareTo(e2) > 0) {
					kleinstesElement = e2;
				}
			}
		}
		return kleinstesElement;

	}

}