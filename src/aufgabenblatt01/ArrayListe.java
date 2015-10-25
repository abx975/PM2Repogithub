package aufgabenblatt01;

/**
 * Diese Klasse repraesentiert die ArrayListe<T>.
 * 
 * @author Nils Eggebrecht, Eduard Veit
 * @version 1.0
 */


public class ArrayListe<Typ> implements Liste<Typ>, Comparable<Typ> {

	int anzahlElemente;
	private Object[] elemente;

	public ArrayListe(int anfangsKapazitaet) {
		anzahlElemente = 0;
		elemente = new Object[anfangsKapazitaet];
	}

	public ArrayListe() {
		this(0);
	}

	@Override
	
	public void hinzufuegen(Typ element) {

		int leange = elemente.length;
		Object[] elemente1 = new Object[leange];
		if (anzahlElemente < elemente.length) {
			elemente[anzahlElemente + 1] = element;
		} else {
			System.arraycopy(elemente, 0, elemente1, 0, leange + 5);
			elemente1[anzahlElemente + 1] = element;
			System.arraycopy(elemente1, 0, elemente, 0, leange + 5);
		}
		anzahlElemente++;
	}

	@Override
	public Typ get(int index) {
		Typ typ = (Typ) elemente[index];
		return typ;
	}

	@Override
	public void entfernen(Typ element) {
		int index = 0;
		while (index < elemente.length) {
			if (elemente[index].equals(element)) {
				elemente[index] = null;
			}
			index++;
		}
	}

	@Override
	public void entferneElementAnIndex(int index) {
		elemente[index] = null;
	}

	@Override
	public int getAnzahlElemente() {
		return anzahlElemente;
	}

	@Override
	public Typ getKleinstesElement() {
		return null;
		
	}

	@Override
	public int compareTo(Typ arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}