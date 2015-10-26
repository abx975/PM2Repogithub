package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Diese Klasse repraesentiert die ArrayListe<T>.
 * 
 * @author Nils Eggebrecht, Eduard Veit
 * @version 1.0
 */
public class ArrayListeTest {

	Integer a, b, c, d;
	Liste<Integer> liste;

	public ArrayListeTest() {
		super();
		liste = new ArrayListe<Integer>();
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
	}

	/**
	 * Prüft das Hinzufügen.
	 */
	@Test
	public void testhinzufuegen() {
		Liste<Integer> localliste = new ArrayListe<Integer>();
		assertTrue("AnzahlElemente muss anfangs 0 sein", localliste.getAnzahlElemente() == 0);
		localliste.hinzufuegen(a);
		assertTrue("Hinzufügen hat nicht geklappt", localliste.get(0).equals(a));
		assertTrue("AnzahlElemente muss 1 sein", localliste.getAnzahlElemente() == 1);
		localliste.hinzufuegen(b);
		assertTrue("Hinzufügen hat nicht geklappt", localliste.get(0).equals(a));
		assertTrue("Hinzufügen hat nicht geklappt", localliste.get(1).equals(b));
		assertTrue("AnzahlElemente muss 2 sein", localliste.getAnzahlElemente() == 2);
	}

	private void bereitevor() {
		liste.hinzufuegen(a);
		liste.hinzufuegen(c);
		liste.hinzufuegen(a);
		liste.hinzufuegen(d);
		liste.hinzufuegen(b);
	}

	/**
	 * Prüft das Entfernen.
	 */
	@Test
	public void testentfernen() {
		bereitevor();
		assertTrue("fünf Elemente sollten anfangs enthalten sein", liste.getAnzahlElemente() == 5);
		assertTrue("zweimal 1 sollte enthalten sein", liste.get(0).equals(liste.get(2)));
		liste.entferneElementAnIndex(3);
		assertTrue("die 3 ist nicht hierher aufgerückt", liste.get(3).equals(b));
		assertTrue("vier Elemente sollten enthalten sein", liste.getAnzahlElemente() == 4);
		liste.entfernen(a);
		assertTrue("2 Elemente sollten enthalten sein", liste.getAnzahlElemente() == 2);
	}

	/**
	 * Prüft das finden des kleinsten Elementes im Array.
	 */
	@Test
	public void testKleinstesElement() {
		bereitevor();
		assertTrue("", liste.getKleinstesElement().equals(a));
	}

	/**
	 * Prüft das finden des kleinsten Elementes im Integer Array.
	 */
	@Test
	public void testKleinstesElement2() {
		Liste<Integer> liste2 = new ArrayListe<Integer>();
		Integer e = 10, f = 11, g = 5;
		liste2.hinzufuegen(e);
		liste2.hinzufuegen(f);
		liste2.hinzufuegen(g);
		assertTrue("", liste2.getKleinstesElement().equals(g));
	}

	/**
	 * Prüft das finden des kleinsten Elementes im String Array.
	 */
	@Test
	public void testKleinstesElementString() {
		Liste<String> liste2 = new ArrayListe<String>();
		liste2.hinzufuegen("z");
		liste2.hinzufuegen("f");
		liste2.hinzufuegen("g");
		assertTrue("", liste2.getKleinstesElement().equals("f"));
	}

	/**
	 * Prüft das berechnen der Summe der Integer String Array.
	 */
	@Test
	public void berechneSummeIntegerTestString() {
		Liste<String> localliste = new ArrayListe<String>();
		localliste.hinzufuegen("a");
		assertTrue("Da der Typ String ist muss ", (localliste.berechneSummeInteger() == 0));
	}

	/**
	 * Prüft das berechnen der Summe der Integer Integer Array.
	 */
	@Test
	public void berechneSummeIntegerTestInteger() {
		Liste<Integer> localliste = new ArrayListe<Integer>();

		localliste.hinzufuegen(a);
		assertTrue("Summe der Integer muss 1 sein", (localliste.berechneSummeInteger() == 1));
		localliste.hinzufuegen(b);
		assertTrue("Summe der Integer muss 3 sein", (localliste.berechneSummeInteger() == 3));
		localliste.hinzufuegen(c);
		assertTrue("Summe der Integer muss 6 sein", (localliste.berechneSummeInteger() == 6));
		localliste.hinzufuegen(d);
		assertTrue("Summe der Integer muss 10 sein", (localliste.berechneSummeInteger() == 10));
	}
	
}