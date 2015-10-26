package aufgabenblatt1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NamensVergleicherTest {

	Pruefungsleistung a = new Pruefungsleistung("a", 15);
	Pruefungsleistung b = new Pruefungsleistung("b", 5);
	Pruefungsleistung c = new Pruefungsleistung("c", 4);
	Pruefungsleistung d = new Pruefungsleistung("d", 4);
	Pruefungsleistung e = new Pruefungsleistung("e", 7);
	
	
	List<Pruefungsleistung> leistungen = new ArrayList<Pruefungsleistung>();
	List<Pruefungsleistung> leistungen2 = new ArrayList<Pruefungsleistung>();

	Student Peter1 = new Student("Peter", "Fox", 123, leistungen);
	Student Peter2 = new Student("Peter", "Fox", 124, leistungen);
	Student Peter3 = new Student("Peter", "Pan", 125, leistungen);
	Student Hans1 = new Student("Hans1", "Fox", 678, leistungen2);
	Student Hans2 = new Student("Hans2", "Pan", 129, leistungen2);
	
	
	
	public NamensVergleicherTest() {
		super();

	}



	@Test
	public void testepetervspeter() {
		NamensVergleicher vergl = new NamensVergleicher();
		assertTrue("auswerten liefert falschen Wert", (vergl.compare(Peter1, Peter2) == 0));
	}
	
	@Test
	public void testNameunterschiedlichenNachnamen() {
		NamensVergleicher vergl = new NamensVergleicher();
		assertTrue("auswerten liefert falschen Wert", (vergl.compare(Peter1, Peter3) < 0));
		assertTrue("auswerten liefert falschen Wert", (vergl.compare(Peter3, Peter1) > 0));
	}

}