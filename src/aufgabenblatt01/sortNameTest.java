package aufgabenblatt01;

import static org.junit.Assert.*;

import org.junit.Test;

import Aufgabenblatt6test.Konstante;

public class sortNameTest {
	
	Student Peter = new Student("Peter", "Fox", 123);
	Student Peter2 = new Student("Peter", "Fox", 124);
	Student Peter3 = new Student("Peter", "Pan", 124);
	Student Hans = new Student("Hans", "Fox", 124);
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testKonstanteFalseAuswerten() {
		assertEquals("auswerten liefert falschen Wert", false,
				compare(Peter,Peter2));
	}
	
	
}
