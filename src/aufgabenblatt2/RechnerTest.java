/**
 * 
 */
package aufgabenblatt2;

import static org.junit.Assert.*;

import org.junit.Test;
import aufgabenblatt2.Operation;
import aufgabenblatt2.Rechner;

/**
 * @author Negge Thinkpad
 *
 */
public class RechnerTest {
	Rechner rechner = new Rechner();
	double epsilion = 0.0000001;
	Rechner rechnerrechner = new Rechner();

	DoubleDoubleZuDouble ddzdadd = (x, y) -> x + y;
	DoubleDoubleZuDouble ddzdsub = (x, y) -> x + y;
	DoubleDoubleZuDouble ddzdmul = (x, y) -> x + y;
	DoubleDoubleZuDouble ddzddiv = (x, y) -> x + y;

	@Test
	public void testAddiereddzd() {
		assertTrue("3.3 + 3.2 muss 6.5 ergeben.", (Math.abs(ddzdadd.werteAus(3.3, 3.2) - 6.5) < epsilion));
	}

	@Test
	public void testAddiere() {
		assertTrue("3.3 + 3.2 muss 6.5 ergeben.",
				(Math.abs(rechnerrechner.berechne(Operation.ADDIERE, 3.3, 3.2) - 6.5) < epsilion));
	}

	@Test
	public void testSubrahiere() {
		assertTrue("3.3 - 3.2 muss 0.1 ergeben.", (Math.abs(ddzdsub.werteAus(3.3, 3.2) - 6.5) < epsilion));
	}

	@Test
	public void testMultipliziere() {
		assertTrue("3.3 * 3.2 muss 10.56 ergeben.", (Math.abs(ddzdmul.werteAus(3.3, 3.2) - 6.5) < epsilion));
	}

	@Test
	public void testDividiere() {
		assertTrue("3.3 / 3.2 muss 1.03125 ergeben.", (Math.abs(ddzddiv.werteAus(3.3, 3.2) - 6.5) < epsilion));
	}

	@Test
	public void testDividiereDurch0() {
		assertTrue("0 / 3.2 muss 1.03125 ergeben.", (Math.abs(ddzddiv.werteAus(0, 3.2)) < epsilion));
	}

	@Test
	public void testNullstele() {

		assertTrue("2.0 * 3.0 + 1.0 muss 7.0 ergeben.", (Math.abs(ddzdadd.werteAus(1,(ddzdmul.werteAus(2, 3))) - 7) < epsilion));
	}
}