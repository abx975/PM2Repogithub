package aufgabenblatt1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListe<Typ extends Comparable<Typ>> implements Liste<Typ> {

	int anzahlElemente;
	private Object[] elemente;
	
	public ArrayListe(int anfangsKapazitaet) {
		anzahlElemente = 0;
		elemente = new Object[anfangsKapazitaet];
	}

	public ArrayListe() {
		this(10); // AnfangsKapazität ist auf 10 gesetzt.
	}
	
	@Override
	public void hinzufuegen(Typ element) {
		sichereKapazitaetZu(anzahlElemente + 1);
		this.elemente[anzahlElemente] = element;
		anzahlElemente++;
	}

	private void sichereKapazitaetZu(int mindestKapazitaet) {
		int alteKapazitaet = elemente.length;
		if (mindestKapazitaet > alteKapazitaet) {
			Object[] alteElemente = elemente;
			int neueKapazitaet = alteKapazitaet + 5;
			elemente = Arrays.copyOf(alteElemente, neueKapazitaet);
		}
	}

	@Override
	public Typ get(int index) {
        if (index >= getAnzahlElemente()) {
            throw new IndexOutOfBoundsException();
        }
		return (Typ) elemente[index];
	}

	@Override
	public void entfernen(Typ element) {
		for (int i = 0; i < getAnzahlElemente(); i++) {
			if (get(i).equals(element)) {
				entferneElementAnIndex(i);
			}
		}
		
	}

	@Override
	public void entferneElementAnIndex(int index) {
        if (index >= getAnzahlElemente()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index, k = i +1; k < elemente.length; i++,k++)
        {
            elemente[i] = elemente[k];
        }
        elemente[anzahlElemente-1] = null; 
        anzahlElemente--;
	}

	@Override
	public int getAnzahlElemente() {
		return anzahlElemente;
	}

	@Override
	public Typ getKleinstesElement() {
		Typ kleinstesElement = null;
		if (getAnzahlElemente() < 1) {
			kleinstesElement = null;
		}
		if (getAnzahlElemente() == 1) {
			kleinstesElement = get(0);
		}
		if (getAnzahlElemente() > 1) {
			kleinstesElement = (Typ) get(0);
			for (int i = 0; i < (anzahlElemente - 1); i++) {
				Typ e2 = (Typ) get(i+1);
				if (kleinstesElement.compareTo(e2) > 0) {
					kleinstesElement = e2;
				} 
			}
		}
		return kleinstesElement;
		
//        LinkedList<Typ> list = new LinkedList<Typ>();
//        for (Object obj: elemente){
//            list.add((Typ)(obj));
//        }
//        Collections.sort(list);
//        return list.get(0);
	}

}