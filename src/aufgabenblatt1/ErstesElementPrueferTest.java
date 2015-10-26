package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErstesElementPrueferTest {
	
	Integer a, b, c, d;
	Liste<Integer> liste;
	
	public ErstesElementPrueferTest() {
		super();
		liste = new ArrayListe<Integer>();
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;
	}
	
	@Test
	public void testeObNumber() {		
		liste.hinzufuegen(a);
		liste.hinzufuegen(b);
		liste.hinzufuegen(c);
		liste.hinzufuegen(d);
		assertTrue("Erster Wert muss Number sein", ErstesElementPruefer.istErstesElementZahl(liste));
	}
	
	@Test
	public void testeObNichtNumber() {
		Liste<String> liste2 = new ArrayListe<String>();
		liste2.hinzufuegen("1");
		assertFalse("Erster Wert muss keine Number sein", ErstesElementPruefer.istErstesElementZahl(liste2));
	}

}