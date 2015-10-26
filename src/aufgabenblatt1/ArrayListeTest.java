/**
 * 
 */
package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Eddy
 *
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

	@Test
	public void testKleinstesElement() {
		bereitevor();
		assertTrue("", liste.getKleinstesElement().equals(a));
	}
	
	@Test
	public void testKleinstesElement2() {
	Liste<Integer> liste2 = new ArrayListe<Integer>();
	Integer e=10,f=11,g=5;
	liste2.hinzufuegen(e);
	liste2.hinzufuegen(f);
	liste2.hinzufuegen(g);
	assertTrue("", liste2.getKleinstesElement().equals(g));
	}
}